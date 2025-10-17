package veiculo;
public class Caminhao extends Veiculo{
  public double capacidadeCarga;
  public int quantidadeEixos;

  public Caminhao(String marca, String modelo, int ano, double capacidadeCarga, int quantidadeEixos) {
    super(marca, modelo, ano);
    this.capacidadeCarga = capacidadeCarga;
    this.quantidadeEixos = quantidadeEixos;
  }

  @Override
  public String exibirInformacoes() {
    return super.exibirInformacoes() + ", Capacidade de Carga: " + capacidadeCarga + ", Quantidade de Eixos " + quantidadeEixos;
  }
}
