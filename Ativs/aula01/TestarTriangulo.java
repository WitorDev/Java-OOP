import java.util.Scanner;

public class TestarTriangulo {
	public static void main(String[] args) {
    // Var
		Scanner sc = new Scanner(System.in);
    Triangulo x, y;
    x = new Triangulo();
    y = new Triangulo();

    System.out.println("Triângulo X"); // Triângulo X
		System.out.printf("Lado1: ");
    x.a = sc.nextDouble();
    System.out.printf("Lado2: ");
    x.b = sc.nextDouble();
    System.out.printf("Lado3: ");
    x.c = sc.nextDouble();
    double areaX = x.calcularArea();     // Calcular e mostrar área do triângulo X
    System.out.println("Área Triângulo X: " + areaX + ".");
    x.mostrarTipo();

    System.out.println("Triângulo Y"); // Triângulo Y
		System.out.printf("Lado1: ");
    y.a = sc.nextDouble();
    System.out.printf("Lado2: ");
    y.b = sc.nextDouble();
    System.out.printf("Lado3: ");
    y.c = sc.nextDouble();
    double areaY = y.calcularArea();     // Calcular e mostrar área do triângulo Y
    System.out.println("Área Triângulo Y: " + areaY + ".");
    y.mostrarTipo();

    if(areaX > areaY) {                  // Comparar área dos triângulos
      System.out.println("O Triângulo X é maior que o Y.");
    } else {
      System.out.println("O Triângulo Y é maior que o X.");
    }

		sc.close();
	}
}
