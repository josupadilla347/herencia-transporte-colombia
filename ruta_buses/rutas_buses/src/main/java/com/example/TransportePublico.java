package com.example;

// TransportePublico.java
public class TransportePublico {
    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido; // en minutos

    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public double calcularTarifa() {
        // Lógica básica para calcular la tarifa
        return tarifa;
    }

    public double calcularDistanciaRecorrida() {
        // Lógica para calcular la distancia recorrida
        return distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        // Lógica para calcular el tiempo recorrido
        return tiempoRecorrido;
    }
}

