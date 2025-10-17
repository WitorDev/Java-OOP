public class Animal {
  private String nome;
  private int idade;
  private String especie;
  private String nomeZoologico;
  private Zelador zelador;

  public Animal(String nome, int idade, String especie, String nomeZoologico, Zelador zelador) {
    this.nome = nome;
    this.idade = idade;
    this.especie = especie;
    this.nomeZoologico = nomeZoologico;
    this.zelador = zelador;
  }

  public Animal(String nome, int idade, String especie, Zelador zelador) {
    this.nome = nome;
    this.idade = idade;
    this.especie = especie;
    this.nomeZoologico = "Zoológico Vida Selvagem";
    this.zelador = zelador;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getNomeZoologico() {
    return nomeZoologico;
  }
  public void setNomeZoologico(String nomeZoologico) {
    this.nomeZoologico = nomeZoologico;
  }

  public Zelador getZelador() {
    return zelador;
  }
  public void setZelador(Zelador zelador) {
    this.zelador = zelador;
  }

  @Override
  public String toString() {
    return especie + " -" + "\nNome: " + nome + "\nIdade: " + idade + "\nZelador: " + zelador.getNome() + "\nCPF: " + zelador.getCpf();
  }
}