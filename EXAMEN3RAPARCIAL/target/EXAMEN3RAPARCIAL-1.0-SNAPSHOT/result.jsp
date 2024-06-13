<!-- src/com/ejemplo/vista/resultado.jsp -->
<%@page import="com.ejemplo.modelo.PrestamoBean"%>
<jsp:useBean id="prestamo" class="com.ejemplo.modelo.PrestamoBean" scope="request" />
<!DOCTYPE html>
<html>
<head>

    <title>Resultado del Préstamo</title>
</head>
<body>
<h1>Resultado del Cálculo del Préstamo</h1>
<p>Cantidad: <%= prestamo.getCantidad() %></p>
<p>Meses: <%= prestamo.getMeses() %></p>
<p>Pago Mensual: <%= prestamo.getPagoMensual() %></p>

<h2>Calendario de Pagos</h2>
<table border="1">
    <tr>
        <th>Mes</th>
        <th>Pago</th>
    </tr>
    <%
        for (int i = 1; i <= prestamo.getMeses(); i++) {
    %>
    <tr>
        <td><%= i %></td>
        <td><%= prestamo.getPagoMensual() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
