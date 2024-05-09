<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenido</title>
</head>
<body>
    <h2>Bienvenido <%= request.getAttribute("usuario") %></h2>
    <a href="LogoutServlet">Cerrar sesión</a>
</body>
</html>