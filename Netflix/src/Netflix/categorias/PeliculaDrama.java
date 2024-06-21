package Netflix.categorias;

import Netflix.Pelicula;
import Netflix.Reproductor;

public class PeliculaDrama extends Pelicula implements Reproductor {
    public PeliculaDrama(String titulo, String creador, int anio, float duracion) {
        super(titulo, creador, anio, duracion);
    }
    @Override
    public void pausar() {
        System.out.println("Pausando drama");
    }

    @Override
    public void play() {
        System.out.println("Resumiendo drama");
    }

    @Override
    public void ponerSubtitulos() {
        System.out.println("Activando subtítulos");
    }
}
