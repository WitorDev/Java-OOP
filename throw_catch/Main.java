public class Main {
  public static void main(String[] args) {
    // String texto = "UniFil";
    String texto = "10";
    // try {
    //   System.out.println(5/0);
    // } catch (Exception e) {
    //   System.out.println("Houve um erro: " + e.getMessage());
    // }

    try {
      int valor = Integer.parseInt(texto);
      System.out.println(valor);
    } catch (NumberFormatException e) {
      System.out.println("Ocorreu um erro: " + e.getMessage());
    } finally {
      System.out.println("Tentativa de conversão");
    }
  }
}