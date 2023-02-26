import java.util.Scanner;

public class Alg40 {
    public static void main(String[] args) {
        int quoc, rest, val1, val2;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o dividendo: ");
        val1 = scan.nextInt();
        System.out.println("\nEntre com o divisor: ");
        val2 = scan.nextInt();
        quoc = val1 / val2;
        rest = val1 % val2;
        System.out.println("\n\nDividendo: " + val1 + "\nDivisor: " + val2 + "\nQuociente: " + quoc + "\nResto: " + rest + "\n");
        scan.close();
    }
}