package ar.com.educacionit.curso.java.mockapp;

import ar.com.educacionit.curso.java.entities.Cliente;
import ar.com.educacionit.curso.java.entities.Direccion;
import ar.com.educacionit.curso.java.entities.Empleado;
import ar.com.educacionit.curso.java.entities.Persona;

/**
 *
 * @author EducaciónIT
 */
public class Herencia {
    public static void main(String[] args) {
        
        
        System.out.println("---- Direccion 1 ----");
        
        Direccion direccion1 = new Direccion("Lavalle", 648, "11", "a");
        System.out.println(direccion1);
        
        
        System.out.println("---- Direccion 2 ----");
        
        Direccion direccion2 = new Direccion("belgrano", 23, null, null, "Moron");
        System.out.println(direccion2);
        
        
        System.out.println("---- Empleado 1 ----");
        
        Empleado empleado1 = new Empleado(1, 60000, "Javier", "Larrosa", 40, direccion2);
        System.out.println(empleado1);
        empleado1.saludar();
              
        
        System.out.println("---- Cliente 1 ----");
        
        Cliente cliente1 = new Cliente(1, "Minorista", "Leando", "Marieti", 44, direccion1);
        System.out.println(cliente1);
        cliente1.saludar();
        
        System.out.println(cliente1.getClass().getName());
        
        System.out.println(cliente1.getClass().getSimpleName());
        
        System.out.println(cliente1.getClass().getSuperclass().getName());
        
        System.out.println(cliente1.getClass().getSuperclass().getSuperclass().getName());
        
        System.out.println(cliente1.getClass()
                .getSuperclass()
                .getSuperclass()
                .getSuperclass());
        
        String texto = "Hola";
        
        System.out.println(texto.getClass().getName());
        System.out.println(texto.getClass().getSuperclass().getName());
        
        //Polimorfismo
        
        Persona p1 = new Empleado(2, 60000, "Mario", "Benelli", 23, direccion1);
        Persona p2 = new Cliente(2, "Mayorista", "Cristina", "Perez", 25, direccion2);
        
        p1.saludar();
        p2.saludar();
        
        //Empleado
        //Empleado e1 = (Empleado)p2;
        Empleado e1 =(p1 instanceof Empleado)?(Empleado)p1:null;
            
        /*
        System.out.println("---- Persona 1 ----");
        
        Persona persona1 = new Persona("Ana", "Gallardo", 23, direccion1);
        System.out.println(persona1);
        
        persona1.saludar();
        
        
        
        System.out.println("---- Persona 2 ----");
        
        Persona persona2 = new Persona("Claudio", "Baez", 55, new Direccion("Larrea", 352, "1", "a"));
        System.out.println(persona2);
        
        persona2.saludar();
        
        
        
        System.out.println("---- Persona 3 ----");
        
        Persona persona3 = new Persona("Laura", "Salinas", 36, persona2.getDireccion());
        System.out.println(persona3);
        
        persona3.saludar();
    */
    }
}

