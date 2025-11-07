public abstract class Personagem {
  private String nome;
  private String nivel;

  public Personagem() { }

  public Personagem(String nome, String nivel) {
    this.nome = nome;
    this.nivel = nivel;
  }

  public abstract void atacar();

  public String exibirStatus() {
    return "Nome: " + nome + " Nível: " + nivel;
  }
}