public class Moto extends Veiculo {
    int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
      super(marca, modelo, ano);
      this.cilindrada = cilindrada;
    }

    @Override
    public String exibirInformações() {
      return super.exibirInformações() + ", Cilindrada: " + cilindrada;
    }
}