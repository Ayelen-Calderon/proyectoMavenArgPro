package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor

public class ListaPersonas {

    private List <Persona> listaP = new ArrayList<>();

    public void agregarPersona(Persona p){
        listaP.add(p);
    }

    @Override
    public String toString() {
        return "ListaPersonas: \n "
                + listaP;
    }
}
