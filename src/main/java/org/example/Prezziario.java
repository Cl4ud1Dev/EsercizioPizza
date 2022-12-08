package org.example;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;



public class Prezziario {
    private Map<String, Double> prezziario;



    Double getPrezzo(String name){
        for(String chiave : prezziario.keySet() ){
            if (chiave.equalsIgnoreCase(name)) {
                return prezziario.get(chiave);
            }
        }
        return null;
    }


    public void setPrezziario(HashMap<String, Double> prezziario) {
        this.prezziario = prezziario;
    }
}
