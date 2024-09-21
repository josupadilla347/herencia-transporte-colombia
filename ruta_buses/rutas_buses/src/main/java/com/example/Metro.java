package com.example;

// Metro.java
public class Metro extends TransportePublico {
    private int numeroEstaciones;

    public Metro(String tipo, String ruta, int numeroEstaciones) {
        super(tipo, ruta);
        this.numeroEstaciones = numeroEstaciones;
    }

    public double calcularTarifaMetro() {
        // Lógica para calcular la tarifa del metro
        this.tarifa = 3000; // Ejemplo
        return this.tarifa;
    }

    public void mostrarMapa() {
        System.out.println("Ruta del Metro: " + ruta);
        System.out.println("Número de Estaciones: " + numeroEstaciones);
    }
}

