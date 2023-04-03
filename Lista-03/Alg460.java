import java.util.Scanner;

public class Alg460 {
  public static int dob(int num) {
    return num * 2;
  }

  public static void fun2() {
    int a, c;
    for (c = 0; c < 3; c++) {
      System.out.println("\n\ndigite numero: ");
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextInt();
      System.out.println("dobro: " + dob(a));
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {
    fun2();
  }
}
