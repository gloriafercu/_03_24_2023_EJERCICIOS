/**
 * EJERCICIO 3:
 * Crear la clase Areas con métodos para calcular el área de un círculo
 * y el área de un rectángulo. Desde una clase principal realizar
 * ambos cálculos y mostrarlos por pantalla.
 *
 * */

package com.adecco.presentacion;

import com.adecco.modelo.Area;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------Ejercicio 3--------------");
        Area objAreas = new Area();
        System.out.println("El área del círculo es: " + objAreas.calcularAreaCirculo(1.5f));
        System.out.println("El área del rectángulo es: " + objAreas.calcularAreaRectangulo(2.5f,6.2f));


    }
}