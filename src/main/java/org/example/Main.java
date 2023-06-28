package org.example;

public class Main {
    public static void main(String[] args) {

        //Este el ejercicio numero uno
        System.out.println("Hello world!");
        // Imprimir los datos vistos en las sesiones
        int numeroEntero = 10;
        System.out.println("Número entero: " + numeroEntero);

        long numeroLargo = 1000000000L;
        System.out.println("Número largo: " + numeroLargo);

        double numeroDecimal = 3.14;
        System.out.println("Número decimal: " + numeroDecimal);

        boolean esVerdadero = true;
        System.out.println("Booleano: " + esVerdadero);

        String texto = "Hola, mundo!";
        System.out.println("Texto: " + texto);

        //este el ejercicio numero dos
        double precio = 100.0;
        double precioConIVA = calcularPrecioConIVA(precio);
        System.out.println("Precio con IVA: " + precioConIVA);

        //este el ejericio numero tres
        String[] textos = {"Hola", " ", "mundo", "!"};
        String resultado = concatenarTextos(textos);
        System.out.println("Resultado final: " + resultado);
    }

    public static double calcularPrecioConIVA(double precio) {
        double iva = 0.21; // Valor del IVA (21%)
        double precioConIVA = precio + (precio * iva);
        return precioConIVA;
    }

    public static String concatenarTextos(String[] textos){
        String resultado = "";
        for (String texto : textos) {
            resultado += texto;
        }
        return resultado;
    }

}