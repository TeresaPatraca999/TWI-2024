<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        Usuario: <input type="text" name="usuario"><br>
        Contraseña: <input type="password" name="contrasena"><br>
        Recordar credenciales: <input type="checkbox" name="recordar"><br>
        <input type="submit" value="Iniciar sesión">
    </form>
    
    <% String error = (String) request.getAttribute("error"); %>
    <% if (error != null) { %>
        <p><%= error %></p>
    <% } %>
</body>
</html>