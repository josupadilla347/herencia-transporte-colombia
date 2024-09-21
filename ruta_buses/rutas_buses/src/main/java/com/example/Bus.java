package com.example;

// Bus.java
public class Bus extends TransportePublico {
    private int capacidad;

    public Bus(String tipo, String ruta, int capacidad) {
        super(tipo, ruta);
        this.capacidad = capacidad;
    }

    public double calcularTarifaBus() {
        // Lógica para calcular la tarifa del bus (personalizar esto)
        this.tarifa = 2000; // Ejemplo
        return this.tarifa;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tarifa: " + calcularTarifaBus());
    }
}

