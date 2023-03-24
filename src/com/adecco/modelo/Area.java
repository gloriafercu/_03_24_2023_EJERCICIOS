package com.adecco.modelo;

public class Area {
    // Métodos
    public float calcularAreaCirculo(float radio) {
        //return 3.1416f * radio * radio;
        float resultado = (float) (Math.PI * Math.pow(radio,2)); // CASTING pq las funciones math quieren datos tipo double
        return resultado;
    }
    public float calcularAreaRectangulo(float base, float altura) {
        return base * altura;
    }
}
