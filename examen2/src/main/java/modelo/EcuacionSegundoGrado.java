package modelo;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;
    
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String resolver() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las raíces son reales y distintas: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "La raíz es real y doble: x = " + x;
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            return "Las raíces son complejas conjugadas: x1 = " + parteReal + " + " + parteImaginaria + "i, x2 = " + parteReal + " - " + parteImaginaria + "i";
        }
    }
}
