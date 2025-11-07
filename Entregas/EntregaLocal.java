// EntregaNacional: frete = distancia * 1.5.

public class EntregaLocal extends Entrega {

  public double calcularValorFrete() {
    return 10.0;
  }

  public EntregaLocal(String codigo) {
    super(codigo);
  }

  public String exibirResumo() {
    return super.exibirResumo() + " Frete: " + calcularValorFrete();
  }
}