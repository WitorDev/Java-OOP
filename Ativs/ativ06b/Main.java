import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    ConversorDolar conversorDolar = new ConversorDolar();
    System.out.println("Qual a cotação do dólar?");
    double cotacao = sc.nextDouble();
    System.out.println("Qual o valor a ser comprado?");
    double valorDolar = sc.nextDouble();
    System.out.printf("Valor a pagar: %,.2f", conversorDolar.calcularValorEmReais(cotacao, valorDolar));
    sc.close();
  }
}

//   Crie uma classe chamada ConversorDolar com:
// um método estático double calcularValorEmReais(double cotacao,
// double valorDolares)
// um valor fixo de IOF de 6%
// O método deve:
// calcular o valor a pagar em reais incluindo IOF
// No programa principal:
// Usar Locale.US
// Solicitar a cotação do dólar e o valor a ser comprado
// Mostrar o valor a pagar em reais com 2 casas decimais e separador de
// milhar usando printf