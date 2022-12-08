package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.applet.AppletContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("file:resources/applicationContext.xml");
        Scontrino scontrino= (Scontrino) context.getBean("Scontrino");
        System.out.println(scontrino.Scontrino());






    }
}