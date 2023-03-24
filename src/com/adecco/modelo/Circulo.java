package com.adecco.modelo;
// La clase Circulo es hija de la clase Punto por eso ponemos el EXTENDS
public class Circulo extends Punto {
    // Atributos
    private double radio;
    // Métodos
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo {" +
                "radio = " + radio + " " +
                "} " + super.toString();
    }

    // Constructores
    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    // Getters y Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

}
