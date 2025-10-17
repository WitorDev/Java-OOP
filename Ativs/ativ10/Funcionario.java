// Classe Funcionario (herda de Pessoa)
//   * Atributos: cargo e salario (privados).
//   * Dois construtores (sobrecarga):
//        o Um que recebe apenas nome e cpf.
//        o Outro que recebe todos os atributos (nome, cpf, cargo e salario).
//   * Método toString() sobrescrito para exibir todas as informações do funcionário.

public class Funcionario extends Pessoa {
  // atributos
  private String cargo;
  private double salario;

  // construtor
  public Funcionario(String nome, String cpf, String cargo, double salario) {
    super(nome, cpf);
    this.cargo = cargo;
    this.salario = salario;
  }

  // métodos assessores
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  // sobrecarga de Funcionário
  public Funcionario(String nome, String cpf) {
    super(nome, cpf);
    cargo = "Funcionário";
    salario = 1000;
  }

  // sobrescrita de toString()
  @Override
  public String toString() {
    return super.toString() + ", Cargo: " + cargo + ", Salário: " + salario;
  }
}
