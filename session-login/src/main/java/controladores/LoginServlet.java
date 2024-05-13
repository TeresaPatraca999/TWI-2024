package controladores;

import java.io.IOException;

import org.bson.Document;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String recordar = request.getParameter("recordar");

        UsuarioDB usuarioDB = new UsuarioDB();
        Document usuarioValidado = usuarioDB.obtenerUsuarioPorCredenciales(usuario, contrasena);

        if (usuarioValidado != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuarioValidado.getString("usuario"));

            if ("on".equals(recordar)) {
                Cookie usuarioCookie = new Cookie("usuario", usuario);
                Cookie contrasenaCookie = new Cookie("contrasena", contrasena);
                response.addCookie(usuarioCookie);
                response.addCookie(contrasenaCookie);
            }

            response.sendRedirect("bienvenida.jsp");
        } else {
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}