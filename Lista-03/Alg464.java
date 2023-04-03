import java.util.Scanner;

public class Alg464 {
  public static double graus(double angulo) {
    return Math.toDegrees(angulo);
  }

  public static void fun6() {
    double ang, g;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\ndigite angulo em radianos: ");
    ang = scanner.nextDouble();

    g = graus(ang);

    System.out.println("\nradianos: " + ang + " graus: " + g);
    System.out.println("\n");
  }

  public static void main(String[] args) {
    fun6();
  }
}
