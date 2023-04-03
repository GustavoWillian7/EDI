import java.util.Scanner;

public class Alg470 {
    public static void main(String[] args) {
        int num, pri;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ndigite um numero >0: ");
        num = scanner.nextInt();
        pri = primo(num);
        if (pri == 0) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }

    public static int primo(int num) {
        int div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            return 0;
        } else {
            return 1;
        }
    }
}
