package Netflix.categorias;

import Netflix.Pelicula;
import Netflix.Reproductor;

public class PeliculaTerror extends Pelicula implements Reproductor {
    public PeliculaTerror(String titulo, String creador, int anio, float duracion) {
        super(titulo, creador, anio, duracion);
    }
    @Override
    public void pausar() {
        System.out.println("Pausando terror");
    }

    @Override
    public void play() {
        System.out.println("Resumiendo terror");
    }

    @Override
    public void ponerSubtitulos() {
        System.out.println("Activando terror");
    }

}
