package ar.com.educacionit.curso.java.entities;

/**
 *
 * @author EducaciónIT
 */
public final class Direccion {            //La palabra "final" Indica que no puede tener clases hijas y no puedo modifiacar su comportamiento
    private String calle;
    private int nro;
    private String piso;
    private String depto;
    private String ciudad;
    
    public Direccion(String calle, int nro, String piso, String depto, String ciudad) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = ciudad;
    }
    /**
     * Constructor para direcciones para la Ciudad Autonoma de Bs As
     * @param calle     
     * @param nro
     * @param piso
     * @param depto
     */
    //@Deprecated
    public Direccion(String calle, int nro, String piso, String depto) {
        this(calle,nro,piso,depto,"CABA");          //Llamado al constructor de la misma clase
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", nro=" + nro + ", piso=" + piso + ", depto=" + depto + ", ciudad=" + ciudad + '}';
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
