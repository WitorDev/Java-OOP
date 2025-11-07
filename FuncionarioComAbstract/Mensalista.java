public class Mensalista extends Funcionario{
  private double salario;

  public Mensalista(String nome, double salario) {
    super(nome);
    this.salario = salario;
  }

  @Override
  public double calcularSalario() {
    return salario;
  }
}
