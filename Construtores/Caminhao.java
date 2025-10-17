public class Caminhao extends Veiculo {
    double capacidadeCarga;
    int quantidadeEixos;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga, int quantidadeEixos) {
      super(marca, modelo, ano);
      this.capacidadeCarga = capacidadeCarga;
      this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String exibirInformações() {
      return super.exibirInformações() + ", Capacidade de Carga: " + capacidadeCarga + ", Quantidade de Eixos: " + quantidadeEixos;
    }
}