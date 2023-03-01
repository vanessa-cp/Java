package com.company;

public class Funciones {

    public static void main(String[] args) {

        //identificador
        holaMundo("Alan");   //crear funcion de holaMundo (invocamos a una funcion)

        holaMundo("Alan");


        String hola = devolverHola();
        System.out.println(hola);

        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static String devolverHola() {
        return "Hola";
    }


    private static void holaMundo(String Alan) { // estructura de un metodo o funcion
        System.out.println("Hola " + Alan);
        System.out.println("Hola mundo");
        //holaMundo identificador
        //void tipo de retorno de dato


        //System.out.println("Hola mundo desde un metodo");
        //public static void holaMundo () {
            System.out.println("Hola mundo");
            System.out.println("Hola mundo");
        }
    }

//}