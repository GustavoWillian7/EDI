import java.util.Scanner;

public class Alg480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        x = reverso(n);
        System.out.println(n + " - " + x);
        if (x == n) {
            System.out.println("É um número capicua");
        } else {
            System.out.println("Não é um número capicua");
        }
    }

    public static int reverso(int num) {
        int reverso = 0;
        while (num > 0) {
            reverso = (reverso * 10) + (num % 10);
            num /= 10;
        }
        return reverso;
    }
}
