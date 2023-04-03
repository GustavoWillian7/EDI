import java.util.Scanner;

public class Alg481 {
    public static void main(String[] args) {
        int num, base, c;
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um número maior ou igual a 0: ");
        num = input.nextInt();
        while (num < 0) {
            System.out.print("\nNúmero negativo. Digite número maior ou igual a 0: ");
            num = input.nextInt();
        }

        System.out.print("\nDigite a base em que deseja representa-lo(2-10): ");
        base = input.nextInt();
        while (base < 2 || base > 10) {
            System.out.print("\nNão sei converter. Digite a base em que deseja representa-lo(2-10): ");
            base = input.nextInt();
        }

        c = converte(num, base);

        System.out.println("\nNúmero em decimal: " + num);
        System.out.println("Número na base " + base + ": " + c);
    }

    public static int converte(int num, int base) {
        int resultado = 0;
        int multiplicador = 1;
        while (num > 0) {
            resultado += (num % base) * multiplicador;
            multiplicador *= 10;
            num /= base;
        }
        return resultado;
    }
}
