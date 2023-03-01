package com.company;

public class Variables {

    public static void main(String[] args) {
        //int[]notas = new int[10];
        int[]notas = {8, 10, 5, 9, 8, 7, 5, 6};

        //notas[0]= 8;
        //notas[1]= 9;

        //System.out.println(notas[0]);

        //for(int i = 0; i < notas.length; i++){
            //System.out.println(notas[i]);

        //}


        notas.binarySearch(notas, 9);
        notas.sort(notas);

        }
    }

