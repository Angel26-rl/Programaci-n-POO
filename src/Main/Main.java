package Main;

import basicsOfPOO.basicPOO;
import exceptionHandling.EjemploExcepciones;
import paquetes.TablasMultiplicar;
import enums.UsoEnum;
import initializer.UsoInitializer;
import parametros.PasoParametros;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PROYECTO PROGRAMACIÓN POO ===");

        // Ejecutar POO
        basicPOO.ejecutar();

        // Ejecutar Excepciones
        EjemploExcepciones.ejecutar();
        
        // Ejecutar paquetes/TablasMultiplicar
        TablasMultiplicar.ejecutar();
        
        // Ejecutar Enum
        UsoEnum.ejecutar();
       
        // Ejecutar initializer
        UsoInitializer.ejecutar();
        
        // Ejecutar PasoParametros
        PasoParametros.ejecutar();
        
        System.out.println("=== Fin Semana 1 ===");
    }
}



