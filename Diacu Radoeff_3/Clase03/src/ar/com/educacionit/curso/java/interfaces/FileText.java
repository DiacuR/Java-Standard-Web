package ar.com.educacionit.curso.java.interfaces;

/**
 *
 * @author EducaciónIT
 */
public class FileText implements I_File{

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo Archivo de Texto");
    }

    @Override
    public String getText() {
        return "Leyendo Archivo de Texto";
    }
    
}
