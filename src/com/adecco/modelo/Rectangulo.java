package com.adecco.modelo;

public class Rectangulo extends Punto {
    private int base;

    private int altura;

    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo {" +
                "base = " + base +
                ", altura = " + altura + " " +
                "} " + super.toString();
    }

    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

}
