
package com.example.entidades;

import org.springframework.stereotype.Component;

@Component
public class ClaseA {
    private ClaseB claseB;

    public ClaseA(ClaseB claseB) {
        this.claseB = claseB;
    }
    public String metodoClaseA() {
          return "Método de la ClaseA que llama a: " 
                  + this.claseB.metodoClaseB();
    }  
}
