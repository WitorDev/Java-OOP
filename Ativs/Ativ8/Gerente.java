public class Gerente extends Funcionario {
  private String departamento;

  public Gerente(String nome, double salario, String funcao, String departamento) {
    super(nome, salario, funcao);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  @Override
  public String toString() {
    return super.toString() + ", Departamento: " + departamento;
  }
}
