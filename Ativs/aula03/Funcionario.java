package aula02;

public class Funcionario {
  // Var
  private String nome;
  private double salario;
  private double imposto;

  // Construtor
  public Funcionario(String nome, double salario, double imposto) {
    this.nome = nome;
    this.salario = salario;
    this.imposto = imposto;
  }

  // Definir novo salário para o funcionário
  public double novoSalario(double salario) {
    return this.salario = salario;
  }

  // Aumentar salário do funcionário
  public void aumentarSalario(double porcentagem) {
    this.salario = this.salario * (porcentagem / 100);
  }

  @Override // Imprimir dados do funcionário
  public String toString() {
    return String.format(
      "Nome: %s " +
      "Salário: %.2f " +
      "Imposto: %.2f ",
      nome, salario, imposto
    );
  }
}
