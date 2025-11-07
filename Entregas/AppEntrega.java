public class AppEntrega {
  public static void main(String[] args) {
    // No main, instancie as duas classes e mostre o resumo das
    // entregas
    Entrega local = new EntregaLocal("12312321");
    Entrega nacional = new EntregaNacional("32123841", 2.80);

    System.out.println(local.exibirResumo());
    System.out.println(nacional.exibirResumo());
  }
}
