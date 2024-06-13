<!-- src/com/ejemplo/vista/index.jsp -->
<!DOCTYPE html>
<html>
<head>

    <title>Calculadora de Préstamos</title>
</head>
<body>
<h1>Calculadora de Préstamos</h1>
<form action="calcular" method="post">
    <label for="cantidad">Cantidad:</label>
    <input type="text" id="cantidad" name="cantidad" required><br><br>
    <label for="meses">Meses (máx. 12):</label>
    <input type="number" id="meses" name="meses" min="1" max="12" required><br><br>
    <input type="submit" value="Calcular">
</form>
</body>
</html>

