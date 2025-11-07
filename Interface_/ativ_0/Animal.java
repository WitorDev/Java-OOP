public class Animal implements SerVivo{
  public boolean vivo = true;

  public Animal(boolean vivo) {
    this.vivo = vivo;
  }

  @Override
  public void mover() {

  }
  @Override
  public void comer(int massa) {

  }
  @Override
  public void info() {
    System.out.printf("Vivo: %s %n", this.vivo ? "SIM" : "NÃO");
  }
}