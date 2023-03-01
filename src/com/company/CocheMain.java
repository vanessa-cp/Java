package com.company;

public class CocheMain {
    public static void main(String[] args) {


        String coche = "alfa romeo"; //identificador= valor asignado
        //invocar el metodo constructor()
        //asignar tipo de dato , identificador = operador new (nos permite crear un objeto apartir de una clase coche)
        Coche  cocheOb = new Coche();


         Coche cocheOb2 = new Coche("rojo", "honda", "civic",1439.45, 5.4); //valores exclusivos de cada objeto

        cocheOb2.acelerar(50);

        System.out.println(cocheOb2);

        cocheOb2.peso= 1350.5;

        System.out.println(cocheOb2);



    }
}
