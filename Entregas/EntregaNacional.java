// EntregaNacional: frete = distancia * 1.5.

// No main, instancie as duas classes e mostre o resumo das
// entregas.

public class EntregaNacional extends Entrega {
  private double distancia;


  public EntregaNacional(String codigo, double distancia) {
    super(codigo);
    this.distancia = distancia;
  }


  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double calcularValorFrete() {
    return distancia * 1.5;
  }

  public String exibirResumo() {
    return super.exibirResumo() + " Frete: " + calcularValorFrete();
  }

}