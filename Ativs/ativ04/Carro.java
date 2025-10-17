public class Carro extends Veiculo {
  public int portas;

  public void buzinar() {
    System.out.println(super.modelo + " diz Beep!, Beep!.");
  }

  @Override
  public void apresentar() {
    super.apresentar();
    System.out.println("portas: " + portas);
  }
}
