public class Main {
  public static void main(String[] args) {
    Exportavel relatorioEstoque = new RelatorioEstoque();
    Exportavel relatorioVendas = new RelatorioVendas();

    Notificador emailNotificador = new EmailNotificador();
    Notificador SmsNotificador = new SmsNotificador();

    RelatorioService relatorioServiceOne = new RelatorioService(SmsNotificador, relatorioEstoque);
    relatorioServiceOne.gerarEEnviar("Jonas");

    RelatorioService relatorioServiceTwo = new RelatorioService(emailNotificador, relatorioVendas);
    relatorioServiceTwo.gerarEEnviar("Mikail");
  }
}
