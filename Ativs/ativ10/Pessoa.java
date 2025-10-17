// Classe Pessoa
//     * Atributos: nome e cpf (privados).
//     * Construtor para inicializar os atributos.
//     * Métodos assessores (getters e setters).
//     * Método toString() sobrescrito para exibir informações da pessoa.

public class Pessoa {
  // atributos
  private String nome;
  private String cpf;

  // construtor
  public Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  // métodos assessores
  public String getNome() {
    return nome;
  }

  public String getCPF() {
    return cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  // sobrescrita de toString()
  @Override
  public String toString() {
    return "Nome: " + nome + ", CPF: " + cpf;
  }
}