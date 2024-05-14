package modelos;

public class Empleado {
    private String nombre;
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getSueldoDiario() {
        return sueldoDiario;
    }


    public void setSueldoDiario(double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }


    private double sueldoDiario;
    private int diasTrabajados;


    public int getDiasTrabajados() {
        return diasTrabajados;
    }


    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }


    public double calcularSueldoTotal() {
        return sueldoDiario * diasTrabajados;
    }
}

