package SistemaCanciones;

public class Album {
    private String nombre;
    private Artista artista;
    private int anio;

    public Album(String nombre, Artista artista, int anio) {
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
