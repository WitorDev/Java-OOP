public class Aluno extends Pessoa {
  // Atributos
  public String curso;

  @Override
  public void apresentar() {
    super.apresentar();
    System.out.println("Curso: " + curso + ".");
  }
}
