package com.example;


import com.example.descuentos.Descuento;
import com.example.entidades.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BasicApplication  implements CommandLineRunner{

    private static Logger cadenaLog = LoggerFactory.getLogger(BasicApplication.class);
    @Autowired
    Persona persona;        

    @Autowired
    @Qualifier("Estudiante")
    Persona estudiante;        
    @Autowired
    @Qualifier("Empleado")
    Persona empleado;

    @Autowired
    @Qualifier("DescuentoPorMonto")
    Descuento descuentoPorValorCompra;
    @Autowired
    @Qualifier("DescuentoPorPorcentaje")        
    Descuento descuentoPorPorcentaje;

    @Override
     public void run(String... args) throws Exception {

         cadenaLog.info("---Inicio---");

         this.persona.setApellidos("Morales");
         this.persona.setNombres("Juan");
         cadenaLog.info("persona-->" + this.persona.toString()); 

         this.estudiante.setApellidos("Castro");
         this.estudiante.setNombres("Ricardo");
         cadenaLog.info("estudiante-->" + this.estudiante.toString()); 


         this.empleado.setApellidos("Romero");
         this.empleado.setNombres("Camilo");
         cadenaLog.info("empleado-->" + this.empleado.toString());            

         cadenaLog.info("Descuento por compra de $1000.0 -->" + descuentoPorValorCompra.aplicarDescuento(1000.0) );     
         cadenaLog.info("Descuento por % -->" + descuentoPorPorcentaje.aplicarDescuento(1000.0) );     

         cadenaLog.info("---Fin---");
     }
    public static void main(String[] args) {
              SpringApplication.run(BasicApplication.class, args);
      }
}

