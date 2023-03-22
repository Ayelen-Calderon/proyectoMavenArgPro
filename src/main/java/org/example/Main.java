package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("pepito", "perez", new Date(15-02-99));
        Persona p2 = new Persona("pepita", "perez", new Date(15-02-99));
        Persona p3 = new Persona("fulanito", "menganito", new Date(15-02-99));
        Persona p4 = new Persona("fulana", "mengana", new Date(15-02-99));


        ListaPersonas lista = new ListaPersonas();
        lista.agregarPersona(p1);
        lista.agregarPersona(p2);
        lista.agregarPersona(p3);
        lista.agregarPersona(p4);
        String mensaje =  lista.toString();
        System.out.println(mensaje);

    }
}