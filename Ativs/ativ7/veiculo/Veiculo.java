package veiculo;
// Crie uma classe base chamada Veiculo com os seguintes atributos:
// marca (String)
// modelo (String)
// ano (int)
// Implemente os seguintes mét

public class Veiculo {
  public String marca;
  public String modelo;
  public int ano;

  // construtor
  public Veiculo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  // construtor sobrecarregado
  public Veiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    ano = 2020;
  }

  public String exibirInformacoes() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
  }
}

