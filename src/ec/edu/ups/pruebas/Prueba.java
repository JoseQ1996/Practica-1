package ec.edu.ups.pruebas;

import ec.edu.ups.clases.Seccion;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.EstructuraPeriodico;
import java.util.Date;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("----------------------");

        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");

        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);
        String nom = facebook.getNombre();
        System.out.println("Nombre: " + nom);
        String url = facebook.getUrl();
        System.out.println("URL: " + url);
        System.out.println(" ");

        System.out.println("----------------------");

        System.out.println(" ");
        Seccion Deportes = new Seccion();
        Deportes.setNombre("Futbol");
        Deportes.setNoticia("Messi Balon De Oro 2019 ");

        String sec = Deportes.getNombre();
        System.out.println("Seccion: " + sec);
        String not = Deportes.getNoticia();
        System.out.println("Noticia: " + not);
        System.out.println(" ");

        System.out.println("----------------------");

        System.out.println(" ");
        Multimedia video = new Multimedia();
        Byte[] bytes = {1, 2, 3};
        video.setArchivo(bytes);
        video.setFormato(" .mp4 ");
        video.setTamañoBytes(20.12);
        video.setNombre("Video1");
        video.setPat("Av. las americas");
        video.setCreacion(new Date());
        video.setModificacion(new Date());

        String nomb = video.getNombre();
        System.out.println("Nombre:  " + nomb);
        String pat = video.getPat();
        System.out.println("Ubicacion:  " + pat);
        bytes = video.getArchivo();
        System.out.println("Archivo: " + bytes);
        String form = video.getFormato();
        System.out.println("Fomato: " + form);
        double tam = video.getTamañoBytes();
        System.out.println("Tamaño: " + tam);
        Date fech = video.getCreacion();
        System.out.println("Creacion: " + fech);
        Date mod = video.getModificacion();
        System.out.println("Modificacion: " + mod);
        System.out.println(" ");

        System.out.println("----------------------");

        System.out.println(" ");
        EstructuraPeriodico Datos = new EstructuraPeriodico();
        Datos.setNombrePeriodico(" PERIODICO VIRTUAL ");
        Datos.setUbicacion("Av. las Americas");
        Datos.setFecha(new Date());

        String no = Datos.getNombrePeriodico();
        System.out.println("Nombre: " + no);
        String ubi = Datos.getUbicacion();
        System.out.println("Ubicacion: " + ubi);
        Date fecha = Datos.getFecha();
        System.out.println("Fecha: " + fecha);
        System.out.println(" ");

        System.out.println("----------------------");

        System.out.println(" ");
        Noticia noticia = new Noticia();
        noticia.setAutor("Autor: ");
        noticia.setContenido("Contenido: ");
        noticia.setFecha(new Date());
        noticia.setTitulo("Titulo: ");
        noticia.setMultimedia(video);

        String aut = noticia.getAutor();
        System.out.println("Franklin Orellana");
        String tit = noticia.getTitulo();
        System.out.println("Nuevo Alcalde De Cuenca");
        String cont = noticia.getContenido();
        System.out.println("Pedro Palacios gana la alcaldia con un 28.9% de votos a favor");
        Multimedia vidnot = noticia.getMultimedia();
        System.out.println("Multimedia: " + vidnot);
        Date fecha1 = noticia.getFecha();
        System.out.println("Fecha: " + fecha1);
        System.out.println(" ");

        System.out.println("----------------------");
        System.out.println(" ");
    }

}
