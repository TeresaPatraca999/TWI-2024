<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenido</title>
</head>
<body>
    <h2>Bienvenido <%= session.getAttribute("usuario") %></h2>
    <a href="LogoutServlet">Cerrar sesión</a>
</body>
</html>