
package com.example;
import com.example.dominio.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication  implements CommandLineRunner{
     
    private static Logger logCadena= LoggerFactory.getLogger(BasicApplication.class);
    
    @Autowired
    private ClaseA objetoClaseA;
    @Autowired
    private ClaseB objetoClaseB;
    @Autowired
    private ClaseC objetoClaseC;
    @Autowired
    private ClaseD objetoClaseD;
    @Autowired
    private ClaseA otroObjetoClaseA;
    @Autowired
    private ClaseB otroObjetoClaseB;    
    
    @Autowired
    private ClaseD otroObjetoClaseD;
      
    
    public static void main(String[] args) {
            SpringApplication.run(BasicApplication.class, args);
    }  
    
    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("***********************************************");           
        logCadena.info("Información objetoClaseA:" + objetoClaseA.informacion());
        logCadena.info("Información objetoClaseB:" + objetoClaseB.informacion());
        
        logCadena.info("Dirección de memoria del objetoClaseA:" + objetoClaseA.toString());
        logCadena.info("Dirección de memoria del objetoClaseB:" + objetoClaseB.toString());
        logCadena.info("Información objetoClaseC:" + objetoClaseC.informacion());
        logCadena.info("Información objetoClaseD:" + objetoClaseD.informacion());
        logCadena.info("Dirección de memoria del objetoClaseD:" + objetoClaseD.toString());
        
        logCadena.info("Dirección de memoria del objetoClaseA:" + otroObjetoClaseA.toString());
        logCadena.info("Dirección de memoria del objetoClaseB:" + otroObjetoClaseB.toString());
        
        logCadena.info("Información objetoClaseD:" + otroObjetoClaseD.informacion());
        logCadena.info("Dirección de memoria del objetoClaseD:" + otroObjetoClaseD.toString());
        
        System.out.println("***********************************************");
    }
}




/*
logCadena.info("Información objetoClaseA:" + otroObjetoClaseA.informacion());
        logCadena.info("Información objetoClaseB:" + otroObjetoClaseB.informacion());
*/
