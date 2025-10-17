package ativ12a;
public class Endereco {
  private String rua;
  private int numero;
  private String bairro;
  private String cidade;
  private String estado;

  // construtor
  public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
  }

  // acessores
  public String getrua() {
    return rua;
  }

  public int getnumero() {
    return numero;
  }

  public String getbairro() {
    return bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEstado() {
    return estado;
  }

  @Override
  public String toString() {
    return "Rua: " + rua + ", Número: " + numero + ", Bairro: " + bairro + ", Cidade: " + cidade + ", Estado: " + estado;
  }
}
