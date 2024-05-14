package controladores;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.EcuacionSegundoGrado;

@WebServlet("/resolverEcuacion")
public class ResolverEcuacionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros 'a', 'b' y 'c' de la petición
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));
        
        // Crear una instancia de EcuacionSegundoGrado
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        
        // Resolver la ecuación
        String resultado = ecuacion.resolver();
        
        // Enviar el resultado como atributo a la vista (resultado.jsp)
        request.setAttribute("resultado", resultado);
        
        // Redirigir a la vista para mostrar el resultado
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
