public class ExportadorDocumento {
    public static String exportarDocumento(Documento documento, FabricaExportador.TipoExportacion tipo, String nombreArchivo) {
        EstrategiaDeExportacion estrategia = FabricaExportador.obtenerExportador(tipo, nombreArchivo);
        Exportable exportable = new Exportable(estrategia);
        exportable.setDocumento(documento);
        return exportable.actuar();
    }
}
