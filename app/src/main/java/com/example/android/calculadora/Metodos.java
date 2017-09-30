package com.example.android.calculadora;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {

    public static double sumar(double n1, double n2){
        return n1+n2;
    }

    public static double restar(double n1, double n2){
        return n1-n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1*n2;
    }

    public static double divir(double n1, double n2){
        return n1/n2;
    }

    public static boolean validarDivison (double n2, int opcion){
        if (n2==0 && opcion == 3) return true;
        else return false;
    }
}
