
package com.example;

import com.example.entidades.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication  implements CommandLineRunner  {

    private static Logger logCadena = LoggerFactory.getLogger(BasicApplication.class);
    
    @Autowired
    private ClaseA claseA;
    @Autowired
    private ClaseC claseC;    
    
    @Autowired
    Persona persona;    
    @Autowired
    Bicicleta bicicleta;
    
    public static void main(String[] args) {
            SpringApplication.run(BasicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        logCadena.info("ClaseA-->" + this.claseA.metodoClaseA());         
        logCadena.info("ClaseC-->" + this.claseC.metodoClaseC());         
        logCadena.info("ClaseC-->" + this.claseC.metodoClaseCqueLlamaClaseA() ); 
        
        logCadena.info("persona-->" + this.persona.toString()); 
        
        this.persona.setApellidos("Morales");
        this.persona.setNombres("Juan");        
        logCadena.info("persona-->" + this.persona.toString()); 
        
        logCadena.info("bicicleta-->" + this.bicicleta.toString());         
    }
}
