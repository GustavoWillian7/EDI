import java.util.Scanner;

public class Alg23 {
    public static void main(String[] args) {
        int a,d;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite um numero de tres casas:");
        a = scan.nextInt();
        d = a % 100 / 10;
        System.out.println("Algarismo da casa das dezenas: " + d + "\n"); 
        scan.close();
    }
}