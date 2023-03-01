package com.company;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {


        // La clase String

    /*

    lencth()
    startsWicth("")
    endsWicth("")
    indexOf("")
    substring(1,5)
    trim()
    equals()
    compareto
     */

        String mensaje = "  Hola mundo  ";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();

        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());//trim quita espacios
        mensajeMay = mensajeMay.trim();


        String otro = "HOLA MUNDO";
        if(mensajeMay.equals(otro)){
            System.out.println("Verddero!!");

        }


    }
}