
package controlador;

import com.ejemplo.modelo.PrestamoBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calcular")
public class PrestamoControlador extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double cantidad = Double.parseDouble(request.getParameter("cantidad"));
        int meses = Integer.parseInt(request.getParameter("meses"));

        PrestamoBean prestamo = new PrestamoBean();
        prestamo.setCantidad(cantidad);
        prestamo.setMeses(meses);
        prestamo.calcularPagoMensual();

        request.setAttribute("prestamo", prestamo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
