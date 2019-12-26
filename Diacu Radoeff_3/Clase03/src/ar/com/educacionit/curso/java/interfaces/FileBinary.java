package ar.com.educacionit.curso.java.interfaces;

/**
 *
 * @author EducaciónIT
 */
public class FileBinary implements I_File{

    @Override
    public void setText(String text) {
        System.out.println("Escibiendo Archivo Binario");
    }

    @Override
    public String getText() {
        return "Leyendo archivo binario";
    }
    
}
