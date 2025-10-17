public class Veiculo {
  String marca;
  String modelo;
  int ano;

  public Veiculo() { }

  public Veiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    ano = 2020;
  }

  public Veiculo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public String exibirInformações() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
  }
}
