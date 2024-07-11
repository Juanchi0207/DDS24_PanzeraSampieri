public class FabricaExportador {
    public static String obtenerEstrategia(String tipo, String nombreDeArchivo, Documento documento) {
        Exportable exportador = null;
        switch (tipo) {
            case "EXCEL":
                exportador = new Exportable(new ExportarAExcel(nombreDeArchivo));
                exportador.setDocumento(documento);
                return exportador.actuar();
            case "PDF":
                exportador = new Exportable(new ExportarPDF(new AdapterApachePDFBox(nombreDeArchivo)));
                exportador.setDocumento(documento);
                return exportador.actuar();
            default:
                throw new IllegalArgumentException("Tipo de exportación no soportado");
        }
    }
}
