// Exercício de Fixação
// Uma empresa deseja controlar informações dos seus funcionários. Cada funcionário tem um nome, um salário e uma função.
// 🎯 Tarefa:
// Crie uma classe Funcionario com:
// Atributos privados: nome, salario, funcao.
// Métodos assessores get e set para todos os atributos.
// No programa principal, leia os dados de um funcionário e exiba as informações formatadas.

public class Funcionario {
  private String nome;
  private double salario;
  private String funcao;

  public Funcionario(String nome, double salario, String funcao) {
    this.nome = nome;
    this.salario = salario;
    this.funcao = funcao;
  }

  public Funcionario(String nome, String funcao) {
    this.nome = nome;
    this.funcao = funcao;
    salario = 1000;
  }

  public String getNome() {
    return nome;
  }
  public double getSalario() {
    return salario;
  }
  public String getFuncao() {
    return funcao;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", Salário: " + salario + ", Função: " + funcao;
  }
}