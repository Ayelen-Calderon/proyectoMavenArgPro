package org.example;

import lombok.*;

import java.util.Date;

@AllArgsConstructor  @NoArgsConstructor
public class Persona {
    @Getter @Setter
    private String nombre, apellido;
    @Getter @Setter
    private Date fechaDeNacimiento;

    @Override
    public String toString() {
        return  "*************************************************** \n " +
                "Nombre y Apellido: " + nombre + ' ' + apellido + '\n' +
                "Fecha De Nacimiento: " + fechaDeNacimiento + '\n' +
                "*************************************************** \n"
                ;
    }
}
