
package com.example.entidades;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Estudiante")
public class Estudiante extends Persona{
    
    private String programaAcademico;
    
    public Estudiante() {        
        this.programaAcademico=this.programaAcademico();
    }

    @Override
    public String toString() {
        return super.toString() +  "Estudiante{" + "programaAcademico=" + programaAcademico + '}';
    }

    public String programaAcademico(){    
        
        return "Ingeniería de Sistemas";
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }   
    
}


