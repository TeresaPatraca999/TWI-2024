<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CALCULO DE SUELDO</title>
</head>
<body>
    <h1>RESULTADO DEL CALCULO</h1>
    <% double sueldoTotal = (double) request.getAttribute("SueldoTotal"); %>
    <p>Sueldo total: <%= sueldoTotal %></p>
</body>
</html>