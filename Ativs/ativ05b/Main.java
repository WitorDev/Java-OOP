import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ConverteMoeda cm = new ConverteMoeda();
    System.out.println("Qual é o preço do dólar?");
    double dolar = sc.nextDouble();
    System.out.println("Quantos dolares serão comprados?");
    int quantidade = sc.nextInt();
    System.out.printf("Valor a pagar em reais = R$%.2f", cm.inserirIOF(cm.comprarDolar(quantidade, dolar)));
  }
}
