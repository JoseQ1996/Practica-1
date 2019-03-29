package ec.edu.ups.clases;

import java.util.Date;

public class Multimedia {

    private String nombre;
    private String formato;
    private double tamañoBytes;
    private String pat;
    private Byte[] archivo;
    private Date creacion;
    private Date modificacion;

    public Date getCreacion() {
        return this.creacion;
    }

    public Date getModificacion() {
        return this.modificacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public void setModificacion(Date modificacion) {
        this.modificacion = modificacion;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getTamañoBytes() {
        return this.tamañoBytes;
    }

    public String getPat() {
        return this.pat;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Byte[] getArchivo() {
        return this.archivo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamañoBytes(double tamañoBytes) {
        this.tamañoBytes = tamañoBytes;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArchivo(Byte[] archivo) {
        this.archivo = archivo;
    }

}
