public class FabricaExportador {
    public enum TipoExportacion { PDF, EXCEL }

    public static EstrategiaDeExportacion obtenerExportador(TipoExportacion tipo, String nombreArchivo) {
        switch (tipo) {
            case PDF:
                AdapterExportadorPDF adapterPDF = new AdapterApachePDFBox(nombreArchivo);
                return new ExportarPDF(adapterPDF);
            case EXCEL:
                return new ExportarAExcel(nombreArchivo);
            default:
                throw new IllegalArgumentException("Tipo de exportación no soportado.");
        }
    }
}
