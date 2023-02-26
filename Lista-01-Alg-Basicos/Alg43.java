import java.util.Scanner;

public class Alg43 {
    public static void main(String[] args) {
        float num, logaritmo;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o logaritmando: ");
        num = scan.nextFloat();
        logaritmo = (float) (Math.log(num) / Math.log(10));
        System.out.println("\nLogaritmo: " + logaritmo + "\n");
        scan.close();
    }
}