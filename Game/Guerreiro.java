public class Guerreiro extends Personagem {
  public Guerreiro(String nome, String nivel) {
    super(nome, nivel);
  }

  public void atacar() {
    System.out.println("Golpe de Espada.");
  }
}
