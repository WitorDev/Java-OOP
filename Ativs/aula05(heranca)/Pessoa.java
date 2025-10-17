public class Pessoa {
  // Atributos
  public String nome;
  public int idade;

  // public String toString() {
  //   return (
  //     "Nome..: " + nome + "\n" +
  //     "Idade.: " + idade + "."
  //   );

  public void apresentar() {
    System.out.println("Nome..: " + nome + "\n" + "Idade.: " + idade + ".");
  }
}