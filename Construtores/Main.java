public class Main {
  public static void main(String[] args) {
    Veiculo v1a = new Veiculo("Maicon", "Bob Spongeman", 1925);
    System.out.println(v1a.exibirInformações());

    Veiculo v1b = new Veiculo("Roberto", "Sponge Bobman");
    System.out.println(v1b.exibirInformações());

    Caminhao v2 = new Caminhao("Looney Tunes", "Lemore do mar", 1990, 220.10, 6);
    System.out.println(v2.exibirInformações());

    Moto v3 = new Moto("Lemonade Sunshine - Banana", "Siri Cascudo", 2201, 150);
    System.out.println(v3.exibirInformações());
  }
}