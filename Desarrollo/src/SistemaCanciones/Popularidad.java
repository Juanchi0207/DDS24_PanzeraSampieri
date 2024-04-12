package SistemaCanciones;

public abstract class Popularidad {

    public abstract void actEstado(Cancion cancion);
    protected abstract String Icono(Cancion cancion);
    protected abstract String Leyenda(Cancion cancion);

    public String detalleCompleto(Cancion cancion){
        String texto= "";
        texto+=Icono(cancion);
        texto+=" - ";
        texto+= Leyenda(cancion);
        return texto;
    }
}
