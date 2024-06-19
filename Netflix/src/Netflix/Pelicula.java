package Netflix;
//polimorfismo check
//herencia check
//excepciones check
//colecciones check
//abstract check

abstract public class Pelicula {
    private String titulo;
    private String creador;
    private int anio;
    private float duracion;

    public Pelicula(String titulo, String creador, int anio, float duracion) {
        this.titulo = titulo;
        this.creador = creador;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return
                "\nTítulo:'" + titulo + '\n' +
                "Creador:'" + creador + '\n' +
                "Año de lanzamiento:" + anio +"\n"+
                "Duración en minutos:" + duracion;
    }
}
