import java.sql.Timestamp;

interface Pagamento {
  void pagar(double valor);
  default String recibo(double valor) {
    Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
    return String.format("Valor: " + valor + "Taxa: [valorTaxa] " + "Total: [total] " + "Meio: " + getClass().getSimpleName() + " Tempo atual: " + currentTimestamp);
  }
  default double taxaAplicada() {
    return 0.0;
  }
}