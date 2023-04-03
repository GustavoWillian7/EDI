import java.util.Scanner;

public class Alg462 {
  public static double media(double n1, double n2, double n3) {
    return (n1 + n2 + n3) / 3;
  }

  public static void fun4() {
    double n1, n2, n3, m;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\ndigite nota 1: ");
    n1 = scanner.nextDouble();

    System.out.println("\ndigite nota 2: ");
    n2 = scanner.nextDouble();

    System.out.println("\ndigite nota 3: ");
    n3 = scanner.nextDouble();

    double avg = media(n1, n2, n3);

    System.out.println("\nmedia aritmetica e " + avg);
    m = avg;

    System.out.println("\nmedia armazenada em variavel = " + m + "\n");
  }

  public static void main(String[] args) {
    fun4();
  }
}
