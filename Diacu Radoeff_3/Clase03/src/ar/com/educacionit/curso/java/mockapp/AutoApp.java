package ar.com.educacionit.curso.java.mockapp;

import ar.com.educacionit.curso.java.entities.Auto;

/**
 *
 * @author EducaciónIT
 */
public class AutoApp {
    public static void main(String[] args) {
        
        System.out.println("---- Auto 1 ----");
        Auto auto1 = new Auto("Fiat", "Uno", "Blanco");
        auto1.acelerar();
        System.out.println(auto1);
        System.out.println(auto1.getVelocidad());
        
        System.out.println("---- Auto 2 ----");
        Auto auto2 = new Auto("Renault", "Kangoo", "Bordo");
        auto2.acelerar();
        auto2.acelerar();
        System.out.println(auto2);
        System.out.println(auto2.getVelocidad());
        
        //Despues de hacer los metodos de Auto staticos se puede usar la clase sin crear objetos
        
        Auto.acelerar();
        Auto.acelerar();
        System.out.println(Auto.getVelocidad());
               
    }
    
         
          
}
