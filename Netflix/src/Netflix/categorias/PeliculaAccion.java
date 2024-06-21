package Netflix.categorias;

import Netflix.Pelicula;
import Netflix.Reproductor;

public class PeliculaAccion extends Pelicula implements Reproductor {
    public PeliculaAccion(String titulo, String creador, int anio, float duracion) {
        super(titulo, creador, anio, duracion);
    }
    @Override
    public void pausar() {
        System.out.println("Pausando acción");
    }

    @Override
    public void play() {
        System.out.println("Resumiendo acción");
    }

    @Override
    public void ponerSubtitulos() {
        System.out.println("Activando subtítulos");
    }
}
