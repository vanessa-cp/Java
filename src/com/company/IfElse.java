package com.company;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 < number2 && number2 < number3) {  //convinando diferentes condiciones /&& (i) se comprueba la primera y la segunda y las 2 tienen que ser verdaderas para que se imprima el verdadero
            System.out.println("verdadero");
            System.out.println("verdadero");
        }else if (number3 < number4){
            System.out.println("else if");
        }//}else {

    }



    }

