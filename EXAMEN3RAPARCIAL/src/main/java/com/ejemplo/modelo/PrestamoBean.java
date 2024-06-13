package com.ejemplo.modelo;

public class PrestamoBean {
    private double cantidad;
    private int meses;
    private double pagoMensual;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void calcularPagoMensual() {
        this.pagoMensual = this.cantidad / this.meses;
    }
}
