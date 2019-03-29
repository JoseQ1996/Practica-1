package ec.edu.ups.clases;
import java.util.Date;
public class Noticia {
    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private Multimedia multimedia;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public Multimedia getMultimedia() {
        return this.multimedia;
    }
    
    
}
