public class Animal {
  private String nome;
  private int idade;
  private Prontuario prontuario;

  // Construtor
  public Animal(String nome, int idade, Prontuario prontuario) {
    this.nome = nome;
    this.idade = idade;
    this.prontuario = prontuario;
  }
  // Sobrecarga de construtor
  public Animal(String nome) {
    this.nome = nome;
    this.idade = 0;
  }

  // Métodos acessores
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return idade;
  }

  // Métodos
  public void falar() {
    System.out.println(nome + " fez um som.");
  }
  public void falar(String som) {
    System.out.println(nome + " fez um som: " + som + ".");
  }

  protected String infoBasica() {
    return "Nome: " + nome + " Idade: " + idade + " Condição médica: " + prontuario.getCondicao();
  }

  // Sobrescrita
  @Override
  public String toString() {
    return infoBasica();
  }
}
