public class Reptil extends Animal {
  private String nome;
  private int idade;
  private Prontuario prontuario;
  private boolean oviparo; // Põe ovos?

  // Construtor
  public Reptil(String nome, int idade, boolean oviparo, Prontuario prontuario) {
    super(nome, idade, prontuario);
    this.oviparo = oviparo;
  }
  // Sobrecarga do construtor
  public Reptil(String nome, boolean oviparo) {
    super(nome);
    this.oviparo = oviparo;
  }

  // Métodos acessores
  public boolean getOviparo() {
    return oviparo;
  }

  // Sobrescrita do método falar()
  @Override
  public void falar() {
    System.out.println(nome + " fez um chiado.");
  }
  @Override
  public void falar(String som) {
    System.out.println(nome + " fez um som: " + som + ".");
  }

  // Sobrescrita do método toString()
  public String toString() {
    return super.toString() + " É oviparo: " + (oviparo ? "Sim" : "Não");
  }
}
