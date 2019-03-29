package ec.edu.ups.pruebas;

import ec.edu.ups.clases.Seccion;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.EstructuraPeriodico;
import java.util.Date;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        RedSocial twitter = new RedSocial();
        twitter.setCodigo(1);
        twitter.setNombre("Twitter ");
        twitter.setUrl("www.twitter.com");

        int cod = twitter.getCodigo();
        System.out.println("Codigo: " + cod);
        String nom = twitter.getNombre();
        System.out.println("Nombre: " + nom);
        String url = twitter.getUrl();
        System.out.println("URL: " + url);
        System.out.println(" ");

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        System.out.println(" ");
        Seccion Deportes = new Seccion();
        Deportes.setNombre("Futbol");
        Deportes.setNoticia("FC Barcelona gana la UEFA Champions League ");

        String sec = Deportes.getNombre();
        System.out.println("Seccion: " + sec);
        String not = Deportes.getNoticia();
        System.out.println("Noticia: " + not);
        System.out.println(" ");

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        System.out.println(" ");
        Multimedia video = new Multimedia();
        Byte[] bytes = {1, 2, 3};
        video.setArchivo(bytes);
        video.setFormato(" .wma ");
        video.setTamañoBytes(20.12);
        video.setNombre("Videos2018");
        video.setPat("Hermano Miguel y Mariscal Lamra 6-21");
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

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        System.out.println(" ");
        EstructuraPeriodico Datos = new EstructuraPeriodico();
        Datos.setNombrePeriodico(" NOTICIERO VIRTUAL ");
        Datos.setUbicacion("Av Solano");
        Datos.setFecha(new Date());

        String no = Datos.getNombrePeriodico();
        System.out.println("Nombre: " + no);
        String ubi = Datos.getUbicacion();
        System.out.println("Ubicacion: " + ubi);
        Date fecha = Datos.getFecha();
        System.out.println("Fecha: " + fecha);
        System.out.println(" ");

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        System.out.println(" ");
        Noticia noticia = new Noticia();
        noticia.setAutor("Autor: ");
        noticia.setContenido("Contenido: ");
        noticia.setFecha(new Date());
        noticia.setTitulo("Titulo: ");
        noticia.setMultimedia(video);

        String aut = noticia.getAutor();
        System.out.println("Jose Quinde");
        String tit = noticia.getTitulo();
        System.out.println("Elecciones Azuay");
        String cont = noticia.getContenido();
        System.out.println("Pedro Palacios es el nuevo Alcalde de Cuenca y Yaku Perez es el nuevo Prefecto");
        Multimedia vidnot = noticia.getMultimedia();
        System.out.println("Multimedia: " + vidnot);
        Date fecha1 = noticia.getFecha();
        System.out.println("Fecha: " + fecha1);
        System.out.println(" ");

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println(" ");
    }

}
