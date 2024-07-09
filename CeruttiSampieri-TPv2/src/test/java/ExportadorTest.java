import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExportadorTest {
    private Documento documento;

    @Before
    public void init() {
        Documento d = new Documento();
        d.agregarDatos("0", "Nombre", "Apellido", "Edad");
        this.documento = d;
    }

    @Test
    public void exportarExcel() {
        this.documento.agregarDatos("1", "Juan", "Sampieri", "19");
        String resultado = FabricaExportador.obtenerEstrategia("EXCEL", "datos.xlsx", documento);
        Assert.assertEquals("datos.xlsx",resultado);
    }

    @Test
    public void exportarPDF() {
        this.documento.agregarDatos("1", "Juan", "Sampieri", "19");
        String resultado = FabricaExportador.obtenerEstrategia("PDF", "datos.pdf", documento);
        Assert.assertEquals("datos.pdf",resultado);
    }
}
