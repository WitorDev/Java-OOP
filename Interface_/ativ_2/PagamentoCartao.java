import java.sql.Timestamp;

public class PagamentoCartao implements Pagamento{
  public void pagar(double valor);
  public String recibo(double valor) {
    Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
    return String.format("Valor: " + valor + "Taxa: [valorTaxa] " + "Total: [total] " + "Meio: " + getClass().getSimpleName() + " Tempo atual: " + currentTimestamp);
  }
  public double taxaAplicada() {
    return 0.029;
  }
}