public class Mamifero extends Animal {
  private boolean possuiPelo;

  public Mamifero(String nome, int idade, String especie, String nomeZoologico, boolean possuiPelo, Zelador zelador) {
    super(nome, idade, especie, nomeZoologico, zelador);
    this.possuiPelo = possuiPelo;
  }

  public Mamifero(String nome, int idade, String especie, boolean possuiPelo, Zelador zelador) {
    super(nome, idade, especie, zelador);
    this.possuiPelo = possuiPelo;
  }

  public boolean getPossuiPelo() {
    return possuiPelo;
  }

  public void setPossuiPelo(boolean possuiPelo) {
    this.possuiPelo = possuiPelo;
  }

  @Override
  public String toString() {
    String pelo;
    if(possuiPelo) {
      pelo = "Sim";
    } else {
      pelo = "Não";
    }
    return super.toString() + "\nPossui pelo? " + pelo + "\nZoológico: " + super.getNomeZoologico() + "\n";
  }
}
