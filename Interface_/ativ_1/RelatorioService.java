public class RelatorioService {
  Notificador notificador;
  Exportavel exportavel;

  public RelatorioService(Notificador notificador, Exportavel exportavel) {
    this.notificador = notificador;
    this.exportavel = exportavel;
  }

  public void gerarEEnviar(String destino) {
    String export = exportavel.exportar();
    notificador.enviar(destino, export);
  }
}
