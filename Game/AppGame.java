public class AppGame {
  public static void main(String[] args) {
    Personagem guerreiro = new Guerreiro("Londrina", "Expert");
    Personagem mago = new Mago("Almir Sater", "Master");

    System.out.println(guerreiro.exibirStatus());
    System.out.println(mago.exibirStatus());

    guerreiro.atacar();
    mago.atacar();
  }
}
