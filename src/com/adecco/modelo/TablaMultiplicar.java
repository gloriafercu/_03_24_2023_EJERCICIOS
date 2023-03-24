package com.adecco.modelo;

public class TablaMultiplicar {
    // 1. Atributos
    private int numero;
    // 2. Métodos
    public String mostrarTabla() {
        String resultado = "La tabla de multiplicar " + numero + "\n";
        for (int i = 1; i <=10; i++) {
            // resultado = resultado + i + " x " + numero + " = " + (i*numero) + "\n";
            resultado += i + " x " + numero + " = " + (i*numero) + "\n";
        }
        return resultado;
    }
    // 3. Constructores
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }
    // 4. Setters y Getters


}
