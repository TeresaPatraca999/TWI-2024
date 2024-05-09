package controladores;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String recordar = request.getParameter("recordar");


        if ("Teresa".equals(usuario) && "123456789".equals(contrasena)) {
            request.setAttribute("usuario", usuario);

            if ("on".equals(recordar)) {
                Cookie usuarioCookie = new Cookie("usuario", usuario);
                Cookie contrasenaCookie = new Cookie("contrasena", contrasena);
                response.addCookie(usuarioCookie);
                response.addCookie(contrasenaCookie);
            }
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}