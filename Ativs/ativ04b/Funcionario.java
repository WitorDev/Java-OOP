public class Funcionario extends Pessoa {
  public String cargo;
  public double salario;

  public void trabalhar() {
    System.out.println("Olha só, chefe, estou trabalhando ein... confia.");
  }

  public void aumentarSalario(int percentual) {
    salario += percentual / 100;
  }

  @Override
  public void apresentar() {
    super.apresentar();
    System.out.println("Cargo: " + cargo + "\nSalario: " + salario);
  }
}
