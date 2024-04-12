package SistemaCanciones;

public class Tendencia extends Popularidad{

    @Override
    public void actEstado(Cancion cancion) {
        cancion.setReproducciones(cancion.getReproducciones() + 1);
        moverANormalSiEsPosible(cancion);
    }

    public void moverANormalSiEsPosible(Cancion cancion){
        //TODO
        // SO
    }

    @Override
    protected String Icono(Cancion cancion) {
        return Icono.FIRE.texto();
    }

    @Override
    protected String Leyenda(Cancion cancion) {
        return cancion.getNombre() + " - " + cancion.getAlbum().getArtista() + " (" + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + ")";
    }

}
