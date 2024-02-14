
package com.example.entidades;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
@Qualifier("Empleado")
public class Empleado extends Persona {
    
    private String cargo;

    public Empleado() {        
        this.cargo="Desarollador de software";
    }

    @Override
    public String toString() {
        return super.toString() +  "Empleado{" + "cargo=" + cargo + '}';
    }
    
    public String cargoAsignado(){        
        return "Desarrollador Java";    
    }    
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
}


