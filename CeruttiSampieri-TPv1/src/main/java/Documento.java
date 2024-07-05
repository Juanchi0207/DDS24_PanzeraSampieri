import java.util.*;

public class Documento {
    private HashMap<String, List<String>> datos;

    public Documento() {
        this.datos = new HashMap<String, List<String>>();}

    public Map<String, List<String>> getDatos() {
        return datos;
    }

    public void setDatos(HashMap<String, List<String>> datos) {
        this.datos = datos;
    }

    public void agregarDatos(String numFila, String nombre, String apellido, String edad){
        List<String> lista = new ArrayList<String>();
        lista.add(nombre);
        lista.add(apellido);
        lista.add(edad);
        datos.put(numFila, lista);
    }
}
