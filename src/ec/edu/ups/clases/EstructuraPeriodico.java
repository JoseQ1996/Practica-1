package ec.edu.ups.clases;

import java.util.Date;

public class EstructuraPeriodico {

    private String ubicacion;
    private String nombrePeriodico;
    private Date fecha;

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public String getNombrePeriodico() {
        return this.nombrePeriodico;
    }

    public Date getFecha() {
        return this.fecha;
    }
}
