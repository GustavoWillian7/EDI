import java.util.Scanner;

public class Alg494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, base, c;
        System.out.print("\nDigite um número maior ou igual a 0: ");
        num = sc.nextInt();
        while (num < 0) {
            System.out.print("\nNúmero negativo. Digite um número maior ou igual a 0: ");
            num = sc.nextInt();
        }
        System.out.print("\nDigite a base em que deseja representá-lo (2-10): ");
        base = sc.nextInt();
        while (base < 2 || base > 10) {
            System.out.print("\nNão sei converter. Digite a base em que deseja representá-lo (2-10): ");
            base = sc.nextInt();
        }
        c = converte(num, base);
        System.out.println("\nNúmero em decimal: " + num);
        System.out.println("Número na base " + base + ": " + c);
    }

    public static int converte(int num, int base) {
        int res = 0, mult = 1;
        while (num > 0) {
            res += (num % base) * mult;
            num /= base;
            mult *= 10;
        }
        return res;
    }
}
