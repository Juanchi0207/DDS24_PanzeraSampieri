import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExportadorTest {
    private  Exportable exportador;
    private Documento documento;
    @Before
    public void init(){
        Documento d = new Documento();
        d.agregarDatos("0", "Nombre", "Apellido", "Edad");
        this.documento=d;
        this.exportador = new Exportable(new ExportarAExcel("datos.xlsx"));
    }

    @Test
    public void exportarExcel(){
        this.documento.agregarDatos("1", "Juan", "Sampieri", "19");
        this.exportador.setDocumento(documento);
        Assert.assertEquals("datos.xlsx", this.exportador.actuar());
    }

    @Test
    public void exportarPDF(){
        this.exportador.setEstrategia(new ExportarPDF(new AdapterApachePDFBox("datos.pdf")));
        this.documento.agregarDatos("1", "Juan", "Sampieri", "19");
        this.exportador.setDocumento(documento);
        Assert.assertEquals("datos.pdf", this.exportador.actuar());
    }
}
