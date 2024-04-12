package SistemaCanciones;

public class En_Auge extends Popularidad{

    private int dislikeCat;
    private int reproducionesCat;

    public En_Auge() {
        this.dislikeCat = 0;
        this.reproducionesCat = 0;
    }

    public int getDislikeCat() {
        return dislikeCat;
    }

    public void setDislikeCat(int dislikeCat) {
        this.dislikeCat = dislikeCat;
    }

    public int getReproducionesCat() {
        return reproducionesCat;
    }

    public void setReproducionesCat(int reproducionesCat) {
        this.reproducionesCat = reproducionesCat;
    }

    @Override
    public void actEstado(Cancion cancion) {
        reproducionesCat ++;
        cancion.setReproducciones(cancion.getReproducciones() + 1);

        if (reproducionesCat > 50000 && cancion.getLikes() > 20000) {
            cancion.setPopularidad(new Tendencia());
        }
        else if (dislikeCat >  5000){
            cancion.setPopularidad(new Normal());
        }
    }

    @Override
    protected String Icono(Cancion cancion) {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String Leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista() + " - " + cancion.getNombre() + " (" + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + ")";
    }

}
