package com.company;

public class ElectricCar extends Coche{

    String motorElectrico;

    public ElectricCar(){

    }

    public ElectricCar(String motorElectrico){

        this.motorElectrico=motorElectrico;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
