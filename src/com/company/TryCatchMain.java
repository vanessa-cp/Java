package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;

        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("cierre de recurso");
        }

        System.out.println("fin");

    }
}
