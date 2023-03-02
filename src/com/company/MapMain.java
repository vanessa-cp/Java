package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static <Strin> void main(String[] args) {

        Map<String, String> personas = new HashMap<>();


        personas.put("123443789H", "Nombre Apellido1º");
        personas.put("348038902B", "Nombre Apellido2º");
        personas.put("938798903F", "Nombre Apellido3º");

        System.out.println(personas);


        //para iterar

        //con bucle for

        //for (String key : personas.keySet()) {
        //System.out.println(key);
    //}
            //for (String value : personas.values()) {
                //System.out.println(value);
            //}

        for (Map.Entry<String, String> pair :personas.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());

        }



        }

    }