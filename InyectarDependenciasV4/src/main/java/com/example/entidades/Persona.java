
package com.example.entidades;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Persona")
public class Persona {

    protected String nombres;
    protected String apellidos;   

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }    
}




//    public Persona(@Value("Vnombres")  String nombres, @Value("${java.home}")  String apellidos) {
//        this.nombres = nombres;
//        this.apellidos = apellidos;        
//    }