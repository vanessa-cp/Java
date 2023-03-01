package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 = new Coche();

        ElectricCar coche2 = new ElectricCar();

        CocheHibrido coche3 = new CocheHibrido();

        //polimorfismo

        Coche coche4 = new ElectricCar();
        Coche Coche5 = new CocheHibrido();

        if (coche4 instanceof Coche){

            System.out.println("coche");
        }


        if (coche4 instanceof ElectricCar){

            System.out.println(" coche electrico");

        }

        if (coche4 instanceof CocheHibrido){

            System.out.println("coche hibrido");


        }

    }


}
