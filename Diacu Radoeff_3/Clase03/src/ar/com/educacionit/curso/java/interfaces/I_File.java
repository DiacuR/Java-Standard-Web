package ar.com.educacionit.curso.java.interfaces;

/**
 *
 * @author EducaciónIT
 */
public interface I_File {
    /*
    Una interface en java
    - No tiene atributos ni metodos constructores
    - Todos los miembros de una interface son publicos
    - Todos los metodos son abstractos(sin codigo).
    - Una clase puede implementar todas las interfaces que necesite.
    */
    /**
     * La javaDOC es heredada a todas las implementaciones
     * @param text 
     */
    void setText(String text);
    String getText();
    
    /*
    Metodos default Java8
    Son metodos que tienen cuerpo(codigo) como una clase puede implementar
    muchas interfaces, se genera una especie de herencia multiple.
    */
    
    default void info(){
        System.out.println("Interface I_File");
    }
}
