import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    // Manual (Sem POO)
    // Triângulo A
    System.out.println("Triângulo A");
		System.out.printf("Lado1: ");
		double a1 = sc.nextDouble();
		System.out.printf("Lado2: ");
		double a2 = sc.nextDouble();
		System.out.printf("Lado3: ");
		double a3 = sc.nextDouble();

		double pA = (a1 + a2 + a3) / 2; // P do triângulo A

		double areaA = Math.sqrt(pA * (pA - a1) * (pA - a2) * (pA - a3));
		System.out.println("A área do triângulo é: " + areaA + ".");

    // Triângulo B
    System.out.println("Triângulo B");
		System.out.printf("Lado1: ");
		double b1 = sc.nextDouble();
		System.out.printf("Lado2: ");
		double b2 = sc.nextDouble();
		System.out.printf("Lado3: ");
		double b3 = sc.nextDouble();

		double pB = (b1 + b2 + b3) / 2; // P do triângulo B

		double areaB = Math.sqrt(pB * (pB - b1) * (pB - b2) * (pB - b3));
		System.out.println("A área do triângulo é: " + areaB + ".");

    // Comparar Triângulos
    if(areaA > areaB) {
      System.out.println("O Triângulo A é maior que o B.");
    } else {
      System.out.println("O Triângulo B é maior que o A.");
    }

		sc.close();
	}
}
