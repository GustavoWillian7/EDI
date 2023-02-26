import java.util.Scanner;

public class Alg42 {
    public static void main(String[] args) {
        float angulo, rang;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite um angulo em graus: ");
        angulo = scan.nextFloat();
        rang = (float) Math.pow(angulo, Math.PI) / 180;
        System.out.println("\nSENO: " + Math.sin(rang) + "\nCOSENO: " + Math.cos(rang) + "\nTANGENTE: " + Math.tan(rang));
        System.out.println("\nCOSECANTE: " + 1 / Math.sin(rang) + "\nSECANTE: " + 1 / Math.cos(rang) + "\nCOTANGENTE: " + 1 / Math.tan(rang) + "\n");
        scan.close();
    }
}