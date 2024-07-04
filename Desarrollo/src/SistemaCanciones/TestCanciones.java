package SistemaCanciones;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

import java.time.LocalDate;

public class TestCanciones {
    @Test
    public void testCanciones(){
        Artista artista = new Artista("coldplay");

        Album album = new Album("albumx", artista, 2015);

        Cancion cancion = new Cancion("The Scientist", album, 500, new Normal(), 100, 80, LocalDate.now());

        assertEquals(new En_Auge(), cancion.getPopularidad());
        cancion.reporducir();
        cancion.reporducir();

    }
}
