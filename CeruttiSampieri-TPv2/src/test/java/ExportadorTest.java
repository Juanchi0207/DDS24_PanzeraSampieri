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
        String resultado = ExportadorDocumento.exportarDocumento(documento, FabricaExportador.TipoExportacion.EXCEL, "datos.xlsx");
        Assert.assertEquals("datos.xlsx", resultado);
    }

    @Test
    public void exportarPDF() {
        this.documento.agregarDatos("1", "Juan", "Sampieri", "19");
        String resultado = ExportadorDocumento.exportarDocumento(documento, FabricaExportador.TipoExportacion.PDF, "datos.pdf");
        Assert.assertEquals("datos.pdf", resultado);
    }
}
