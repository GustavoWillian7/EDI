import java.util.Scanner;

public class Alg41 {
    public static void main(String[] args) {
        float a, b, c, d, mp;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o primeiro numero: ");
        a = scan.nextFloat();
        System.out.println("\nEntre com o segundo numero: ");
        b = scan.nextFloat();
        System.out.println("\nEntre com o terceiro numero: ");
        c = scan.nextFloat();
        System.out.println("\nEntre com o quarto numero: ");
        d = scan.nextFloat();
        mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10;
        System.out.println("Media pondera: " + mp + "\n");
        scan.close();
    }
}