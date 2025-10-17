package veiculo;
public class Moto extends Veiculo{
  public int cilindrada;

  public Moto(String marca, String modelo, int ano, int cilindrada) {
    super(marca, modelo, ano);
    this.cilindrada = cilindrada;
  }

  @Override
  public String exibirInformacoes() {
    return super.exibirInformacoes() + ", Cilindrada: " + cilindrada;
  }
}
