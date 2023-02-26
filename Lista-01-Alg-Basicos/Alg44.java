import java.util.Scanner;

public class Alg44 {
    public static void main(String[] args) {
        float num, base, logaritmo;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o logaritmando: ");
        num = scan.nextFloat();
        System.out.println("\nEntre com a base: ");
        base = scan.nextFloat();
        logaritmo = (float) (Math.log(num) / Math.log(base));
        System.out.println("\nLogaritmo de: " + num + " na base " + base + " e " + logaritmo + "\n");
        scan.close();
    }
}