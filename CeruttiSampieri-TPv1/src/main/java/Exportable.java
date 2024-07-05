import java.util.List;
import java.util.Map;

public class Exportable {
    private EstrategiaDeExportacion estrategia;
    private Documento documento;

    public Exportable(EstrategiaDeExportacion estrategia) {
        this.estrategia = estrategia;
    }

    public EstrategiaDeExportacion getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstrategiaDeExportacion estrategia) {
        this.estrategia = estrategia;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String actuar(){
        return this.estrategia.exportar(this);
    }

    public Map<String, List<String>> datos(){
        return documento.getDatos();
    }
}
