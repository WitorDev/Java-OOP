package ativ12b;

public class Funcionario {
  private String nome;
  private int matricula;
  private Departamento departamento;

  // construtores
  public Funcionario(String nome, int matricula, Departamento departamento) {
    this.nome = nome;
    this.matricula = matricula;
    this.departamento = departamento;
  }

  // acessores
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public Departamento getDepartamento() {
    return departamento;

  }

  public String exibirInformacoes() {
    return "Nome: " + nome + ", Matrícula: " + matricula + ", Departamento: " + departamento;
  }
}
