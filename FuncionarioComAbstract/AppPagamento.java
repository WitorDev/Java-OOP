public class AppPagamento {
  public static void main(String[] args) {
    Funcionario horista = new Horista("João", 10, 160);
    Funcionario mensalista = new Mensalista("Marcos", 1200);

    horista.calcularSalario();
    mensalista.calcularSalario();

    System.out.println(horista.contraCheque());
    System.out.println(mensalista.contraCheque());
  }
}