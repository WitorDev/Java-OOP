public class Programador extends Funcionario {
  private String linguagem;

  public Programador(String nome, double salario, String funcao, String linguagem) {
    super(nome, salario, funcao);
    this.linguagem = linguagem;
  }

  public String getLinguagem() {
    return linguagem;
  }

  @Override
  public String toString() {
    return super.toString() + ", Linguagem: " + linguagem;
  }
}
