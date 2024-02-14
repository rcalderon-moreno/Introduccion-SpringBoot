

package com.example.entidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClaseC {
    
    @Autowired
    private ClaseB claseB;
    
    private ClaseA claseA;
    
    public ClaseC(@Autowired ClaseA claseA) {
        this.claseA = claseA;
    }
    
    public String metodoClaseC() {
           return "Método de la ClaseC que llama a: " 
                   + this.claseB.metodoClaseB();
    }  
    
    public String metodoClaseCqueLlamaClaseA() {
           return "Método de la ClaseC que llama a: " 
                   + this.claseA.metodoClaseA();
    }  
}

