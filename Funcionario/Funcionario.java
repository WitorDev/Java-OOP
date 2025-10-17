public class Funcionario {
  private String nome;
  private double salario;

  public Funcionario() {

  }

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  public double getSalario() { return salario; }
  public void setNome(double salario) { this.salario = salario; }

  public double getBonificacao() { return this.salario * 0.10; }

  @Override
  public String toString() {
    return "Nome: " + nome + " Salario: " + salario;
  }
}