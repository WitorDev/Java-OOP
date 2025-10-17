package ativ12a;
public class Pessoa {
  private String nome;
  private String cpf;
  private Endereco endereco;

  // construtor
  public Pessoa(String nome, String cpf, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
  }

  // acessores
  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco.toString();
  }
}
