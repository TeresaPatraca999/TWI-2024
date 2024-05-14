package controladores;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calcularSueldo")
public class CalcularSueldoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        double sueldoDiario = Double.parseDouble(request.getParameter("sueldoDiario"));
        int diasTrabajados = Integer.parseInt(request.getParameter("diasTrabajados"));

        // Validar cantidad de días trabajados
        if (diasTrabajados < 1 || diasTrabajados > 15) {
            response.getWriter().println("La cantidad de días trabajados debe estar entre 1 y 15.");
            return;
        }

        // Calcular sueldo total
        double sueldoTotal = sueldoDiario * diasTrabajados;

        // Mostrar resultado al usuario
        response.getWriter().println("El sueldo total de " + nombre + " es: " + sueldoTotal);
    }
}
