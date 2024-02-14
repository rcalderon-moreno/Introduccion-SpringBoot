


package com.example;

import com.example.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication implements CommandLineRunner{
    
    private static Logger cadenaLog = LoggerFactory.getLogger(BasicApplication.class);

    @Autowired
    private IPersonaService personaService;

    public static void main(String[] args) {
            SpringApplication.run(BasicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        cadenaLog.info("********Inicio********");        
        this.personaService.registrar("Roger");        
        cadenaLog.info("********Fin********");
    }
}




