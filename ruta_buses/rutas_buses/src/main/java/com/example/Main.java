package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        Bus miBus = new Bus("Bus urbano", "Calle 10 - Calle 20", 50);
        miBus.calcularTarifaBus();
        miBus.mostrarInformacion();

        Metro miMetro = new Metro("Metro de Medellín", "Estación A - Estación B", 10);
        miMetro.calcularTarifaMetro();
        miMetro.mostrarMapa();

        Transmilenio miTransmilenio = new Transmilenio("Transmilenio", "Parada 1 - Parada 5", 8);
        miTransmilenio.calcularTarifaTransmilenio();
        miTransmilenio.mostrarRuta();
    }
}
