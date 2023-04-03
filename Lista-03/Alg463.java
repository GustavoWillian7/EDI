import java.util.Scanner;

public class Alg463 {
  public static double radiano(double angulo) {
    return Math.toRadians(angulo);
  }

  public static void fun5() {
    double ang, r;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\ndigite angulo em graus: ");
    ang = scanner.nextDouble();

    r = radiano(ang);

    System.out.println("\ngraus: " + ang + " radianos: " + r);
    System.out.println("\n");
  }

  public static void main(String[] args) {
    fun5();
  }
}
