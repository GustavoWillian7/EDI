import java.util.Scanner;

public class Alg46 {
    public static void main(String[] args) {
        float saldo, nsaldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite saldo: ");
        saldo = scan.nextFloat();
        nsaldo = (float) (saldo * 1.01);
        System.out.println("\nNovo saldo: " + nsaldo + "\n");
        scan.close();
    }
}