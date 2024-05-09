package controladores;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie usuarioCookie = new Cookie("usuario", "");
        Cookie contrasenaCookie = new Cookie("contrasena", "");
        usuarioCookie.setMaxAge(0);
        contrasenaCookie.setMaxAge(0);
        response.addCookie(usuarioCookie);
        response.addCookie(contrasenaCookie);
        response.sendRedirect("login.jsp");
    }
}