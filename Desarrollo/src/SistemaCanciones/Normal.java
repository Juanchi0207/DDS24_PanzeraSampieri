package SistemaCanciones;

public class Normal extends Popularidad{

    private int reproducionesCat;

    public Normal() {
        this.reproducionesCat = 0;
    }

    @Override
    public void actEstado(Cancion cancion) {
        reproducionesCat ++;
        if(reproducionesCat > 1000){
            cancion.setPopularidad(new En_Auge());
        }
    }

    @Override
    protected String Icono(Cancion cancion) {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String Leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista() + " - " + cancion.getAlbum().getNombre() + " - " + cancion.getNombre();
    }


}
