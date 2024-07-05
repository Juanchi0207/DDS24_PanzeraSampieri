public class ExportarPDF implements EstrategiaDeExportacion {
    private AdapterExportadorPDF adapter;

    public ExportarPDF(AdapterExportadorPDF adapter) {
        this.adapter = adapter;
    }

    public String exportar(Exportable exportable){
        return this.adapter.exportar(exportable);
    }
}
