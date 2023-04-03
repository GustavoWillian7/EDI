import java.util.Scanner;

public class Alg465 {
  public static void verifica(int num1, int num2) {
    if (num1 > num2) {
      System.out.println("O numero 1 (" + num1 + ") e maior que o numero 2 (" + num2 + ")");
    } else if (num1 < num2) {
      System.out.println("O numero 2 (" + num2 + ") e maior que o numero 1 (" + num1 + ")");
    } else {
      System.out.println("Os numeros sao iguais");
    }
  }

  public static void fun7() {
    int num1, num2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\nDigite numero 1: ");
    num1 = scanner.nextInt();

    System.out.println("\n\nDigite numero 2: ");
    num2 = scanner.nextInt();

    verifica(num1, num2);

    System.out.println("\n");
  }

  public static void main(String[] args) {
    fun7();
  }
}
