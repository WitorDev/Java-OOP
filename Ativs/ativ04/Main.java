public class Main {
  public static void main(String[] args) {
    Veiculo veiculo = new Veiculo();
    Carro carro = new Carro();

    veiculo.marca = "Fiat";
    veiculo.modelo = "Uno (Com escada)";
    veiculo.velocidadeAtual = 0;

    carro.marca = "Volkswagen";
    carro.modelo = "Gol Quadrado";
    carro.portas = 4;
    carro.velocidadeAtual = 0;

    veiculo.acelerar(10);
    veiculo.frear(5);
    veiculo.apresentar();

    System.out.println("");

    carro.acelerar(20);
    carro.frear(10);
    carro.apresentar();

    carro.buzinar();
  }
}
