/**
 *  * EJERCICIO 5:
 *  * Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe
 *  * contar con un constructor que indica la tabla que se va a mostrar. Debe contar con un
 *  * método que dé como resultado un string para mostrar diez línea de la tabla del
 *  * número dado en el constructor.
* */

package com.adecco.presentacion;

import com.adecco.modelo.TablaMultiplicar;

public class ProbarTablaMultiplicar {
    public static void main(String[] args) {
        TablaMultiplicar t1 = new TablaMultiplicar(5);
        System.out.println(t1.mostrarTabla());


    }
}
