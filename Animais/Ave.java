public class Ave extends Animal {
  private String nome;
  private int idade;
  private Prontuario prontuario;
  private String tipoDeBico;

  // Construtor
  public Ave(String nome, int idade, String tipoDeBico, Prontuario prontuario) {
    super(nome, idade, prontuario);
    this.tipoDeBico = tipoDeBico;
  }
  // Sobrecarga do construtor
  public Ave(String nome, String tipoDeBico) {
    super(nome);
    this.tipoDeBico = tipoDeBico;
  }

  // Métodos acessores
  public String getTipoDeBico() {
    return tipoDeBico;
  }

  // Sobrescrita do método falar()
  @Override
  public void falar() {
    System.out.println(nome + " fez um canto.");
  }
  @Override
  public void falar(String som) {
    System.out.println(nome + " fez um som: " + som + ".");
  }

  // Sobrescrita do método toString()
  public String toString() {
    return super.toString() + " Tipo de bico: " + tipoDeBico;
  }
}
