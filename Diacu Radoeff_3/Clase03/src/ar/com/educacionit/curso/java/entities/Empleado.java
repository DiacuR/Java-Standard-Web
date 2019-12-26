package ar.com.educacionit.curso.java.entities;

/**
 *
 * @author EducaciónIT
 */
public class Empleado extends Persona {

    private int legajo;
    private double sBasico;

    public Empleado(int legajo, double sBasico, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.legajo = legajo;
        this.sBasico = sBasico;
    }
    
    
    @Override
    public void saludar() {
        System.out.println("Hola soy un empleado");
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "legajo=" + legajo + ", sBasico=" + sBasico + '}';
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getsBasico() {
        return sBasico;
    }

    public void setsBasico(double sBasico) {
        this.sBasico = sBasico;
    }
    
}
