<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Sueldo</title>
</head>
<body>
    <h2>Ingrese los datos del empleado:</h2>
    <form action="calcularSueldo" method="post">
        Nombre: <input type="text" name="nombre"><br>
        Sueldo Diario: <input type="text" name="sueldoDiario"><br>
        Dias Trabajados: <input type="number" name="diasTrabajados" min="1" max="15"><br>
        <input type="submit" value="Calcular Sueldo">
    </form>
</body>
</html>

