package ar.com.educacionit.curso.java.entities;

/**
 *
 * @author EducaciónIT
 */
public class Cliente extends Persona {
    
    private int nro;
    private String categoria;

    public Cliente(int nro, String categoria, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.nro = nro;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "nro=" + nro + ", categoria=" + categoria + '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un Cliente");
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
