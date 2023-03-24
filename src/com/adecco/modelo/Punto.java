package com.adecco.modelo;

public class Punto {
    // 1. Atributos
    protected int x;
    protected int y;
    // 2. Métodos

    @Override
    public String toString() {
        return "Punto { " +
                "x = " + x +
                ", y = " + y + " " +
                '}';
    }
    // 3. Constructores
    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 4. Getters y setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
