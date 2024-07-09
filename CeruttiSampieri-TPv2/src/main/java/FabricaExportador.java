public class FabricaExportador {
    public static String obtenerEstrategia(String tipo, String nombreDeArchivo, Documento documento) {
        switch (tipo) {
            case "EXCEL":
                Exportable exportador = new Exportable(new ExportarAExcel(nombreDeArchivo));
                exportador.setDocumento(documento);
                return exportador.actuar();
            case "PDF":
                Exportable exportador1 = new Exportable(new ExportarPDF(new AdapterApachePDFBox(nombreDeArchivo)));
                exportador1.setDocumento(documento);
                return exportador1.actuar();
            default:
                throw new IllegalArgumentException("Tipo de exportación no soportado");
        }
    }
}
