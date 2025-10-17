public class Veiculo {
  public String marca;
  public String modelo;
  public double velocidadeAtual;

  public void acelerar(double velocidade) {
    velocidadeAtual += velocidade;
  }

  public void frear(double velocidade) {
    if (velocidade < 0) {
      return;
    }
    velocidadeAtual -= velocidade;
  }

  public void parar() {
    velocidadeAtual = 0;
  }

  public void apresentar() {
    System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade Atual: " + velocidadeAtual);
  }
}