public class Secretario extends Funcionario{

  public Secretario() {}

  public Secretario(String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public double getBonificacao() { return getSalario() * 0.15; }
}
