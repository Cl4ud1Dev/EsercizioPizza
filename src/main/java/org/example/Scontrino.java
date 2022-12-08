package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import java.util.Scanner;

public class Scontrino {
    Double Consegna;

    public Double getConsegna() {
        return Consegna;
    }

    public void setConsegna(Double consegna) {
        Consegna = consegna;
    }

    Scanner input = new Scanner(System.in);



    Double Totale;
    Map<Integer, String> Ordine;

    public  Double Scontrino(){
        ApplicationContext context = new FileSystemXmlApplicationContext("file:resources/applicationContext.xml");
        Prezziario prezziario = (Prezziario) context.getBean("Prezziario");
        Double totale = 0.0;
        boolean flag = true;
        while(flag == true) {
            System.out.println("Quale pizza vuoi ordinare?");
            String pizza = input.next();
            Double prezzopizza = prezziario.getPrezzo(pizza);
            if(prezzopizza == null){
                System.out.println("Pizza non disponibile sceglierne un altra");
            }
            else {
                System.out.println("In che quantita'?");
                int quantità = input.nextInt();
                totale = totale + prezzopizza * quantità;

            }

            System.out.println("Vuoi ordinare altro?");
            String scelta = input.next();
            if(scelta.equalsIgnoreCase("si")) {
                flag = true;
            }
            else if(scelta.equalsIgnoreCase("no"))
                flag = false;


        }
        System.out.println("Totale Ordine");

        if(totale == 0)
            return totale;
        else
        return totale + Consegna;

    }






}

