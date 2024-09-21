package com.example;
// Transmilenio.java
public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    public Transmilenio(String tipo, String ruta, int numeroParadas) {
        super(tipo, ruta);
        this.numeroParadas = numeroParadas;
    }

    public double calcularTarifaTransmilenio() {
        // Lógica para calcular la tarifa del Transmilenio
        this.tarifa = 2500; // Ejemplo
        return this.tarifa;
    }

    public void mostrarRuta() {
        System.out.println("Ruta de Transmilenio: " + ruta);
        System.out.println("Número de Paradas: " + numeroParadas);
    }
}
