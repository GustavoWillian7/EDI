import java.util.Scanner;

public class Alg473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        int x;
        
        System.out.println("Digite uma letra: ");
        c = sc.next();
        
        x = maiuscula(c);
        
        if (x == 1) {
            System.out.println("\nÉ uma consoante");
        } else {
            System.out.println("\nNão é uma consoante");
        }
    }
    
    public static int maiuscula(String letra) {
        char l = letra.charAt(0);
        if (l >= 'A' && l <= 'Z' && l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') {
            return 1;
        } else {
            return 0;
        }
    }
}
