public class Mamifero extends Animal {
  private String nome;
  private int idade;
  private Prontuario prontuario;
  private int numeroDePatas;

  // Construtor
  public Mamifero(String nome, int idade, int numeroDePatas, Prontuario prontuario) {
    super(nome, idade, prontuario);
    this.numeroDePatas = numeroDePatas;
  }
  // Sobrecarga do construtor
  public Mamifero(String nome, int numeroDePatas) {
    super(nome);
    this.numeroDePatas = numeroDePatas;
  }

  // Métodos acessores
  public int getNumeroDePatas() {
    return numeroDePatas;
  }

  // Sobrescrita do método falar()
  @Override
  public void falar() {
    System.out.println(nome + " fez um grunhido.");
  }
  @Override
  public void falar(String som) {
    System.out.println(nome + " fez um som: " + som + ".");
  }

  // Sobrescrita do método toString()
  public String toString() {
    return super.toString() + " Numero de Patas: " + numeroDePatas;
  }
}
