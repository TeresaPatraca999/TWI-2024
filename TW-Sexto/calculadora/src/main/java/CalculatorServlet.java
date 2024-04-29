
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operador = request.getParameter("operador");
        
        // Realizar la operación
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "División por cero no permitida");
                    return;
                }
                break;
        }
        
        // Generar la respuesta HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Resultado</title></head><body>");
        out.println("<h1>Resultado:</h1>");
        out.println("<p>" + num1 + " " + operador + " " + num2 + " = " + resultado + "</p>");
        out.println("</body></html>");
        out.close();
    }
}

