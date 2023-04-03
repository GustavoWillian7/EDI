import java.util.Scanner;

public class Alg471 {
    public static void main(String[] args) {
        int num, numl, n;
        System.out.println("\nDigite dividendo: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("\nDigite divisor: ");
        numl = input.nextInt();
        while (numl > num) {
            System.out.println("\nINVALIDO. Digite numero menor do que o dividendo: ");
            numl = input.nextInt();
        }
        /* chama a funcao divisor */
        n = divisor(num, numl);
        if (n == 0) {
            System.out.println("\nNenhuma vez");
        } else {
            System.out.println("\nNumero de vezes: " + n);
        }
    }

    public static int divisor(int num, int numl) {
        int count = 0;
        while (num >= numl) {
            num -= numl;
            count++;
        }
        return count;
    }
}
