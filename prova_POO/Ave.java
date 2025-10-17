public class Ave extends Animal {
  private String tipoBico; // possui bico

  public Ave(String nome, int idade, String especie, String nomeZoologico, String tipoBico, Zelador zelador) {
    super(nome, idade, especie, nomeZoologico, zelador);
    this.tipoBico = tipoBico;
  }

  public Ave(String nome, int idade, String especie, String tipoBico, Zelador zelador) {
    super(nome, idade, especie, zelador);
    this.tipoBico = tipoBico;
  }

  public String getTipoBico() {
    return tipoBico;
  }

  public void setTipoBico(String tipoBico) {
    this.tipoBico = tipoBico;
  }

  @Override
  public String toString() {
    return super.toString() + "\nTipo de bico: " + tipoBico + "\nZoológico: " + super.getNomeZoologico() + "\n";
  }
}
