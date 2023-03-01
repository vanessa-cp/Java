package com.company;

public class WhilelLoop {

    public static void main(String[] args) {

        boolean check = true; //crear condicion para poder evaluar

        int count = 0;
        while(count < 10){

            count++; //condicion

            if(count == 6)
                break;// rompe el flujo de ejecucion ( se terminaria el bucle en el 5)

                //continue; // salta el valor 6 y continua a la siguiente interaccion
            System.out.println("Hola mundo " + count);

        }
        System.out.println("fin");
    }
}
