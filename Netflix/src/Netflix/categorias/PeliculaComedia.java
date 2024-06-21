package Netflix.categorias;

import Netflix.Pelicula;
import Netflix.Reproductor;

public class PeliculaComedia extends Pelicula implements Reproductor {
    public PeliculaComedia(String titulo, String creador, int anio, float duracion) {
        super(titulo, creador, anio, duracion);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando comedia");
    }

    @Override
    public void play() {
        System.out.println("Resumiendo comedia");
    }

    @Override
    public void ponerSubtitulos() {
        System.out.println("Activando subtítulos");
    }
}
