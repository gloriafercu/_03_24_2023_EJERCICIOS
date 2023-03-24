/**
 * EJERCICIOS DE HERENCIAS:
 * Calcular area circulo y rectangulo a partir
 * de una clase padre Punto.
 * */

package com.adecco.presentacion;

import com.adecco.modelo.Circulo;
import com.adecco.modelo.Punto;
import com.adecco.modelo.Rectangulo;

public class ProbarHerencia {
    public static void main(String[] args) {
        Punto p1 = new Punto(0,1);
        System.out.println(p1.toString());

        Circulo c1 = new Circulo(2);
        System.out.println("Área del círculo es: " + c1.calcularArea());

        Rectangulo r1 = new Rectangulo(2,4,5,9);
        System.out.println("Área del rectángulo es: " + r1.calcularArea());

        Circulo c2 = new Circulo(2,5,1);
        System.out.println(c2.toString());
        System.out.println("Área del cículo2 es: " + c2.calcularArea());

        Rectangulo r2 = new Rectangulo(6,7);
        System.out.println(r2.toString());
        System.out.println("Área del rectángulo2 es: " + r2.calcularArea());


    }
}
