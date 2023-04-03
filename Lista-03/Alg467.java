import java.util.Scanner;

public class Alg467 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double z = 0, L, b;
        int c;
        
        for(c = 1; c <= 3; c++) {
            
            System.out.print("\nDigite logaritmando maior que 0: ");
            L = sc.nextDouble();
            
            while(L <= 0) {
                System.out.print("\nInválido. Digite logaritmando maior que 0: ");
                L = sc.nextDouble();
            }
            
            System.out.print("\nDigite base maior que 0 e diferente de 1: ");
            b = sc.nextDouble();
            
            while(b <= 0 || b == 1) {
                System.out.print("\nInválido. Digite base maior que 0 e diferente de 1: ");
                b = sc.nextDouble();
            }
            
            System.out.println("\nLogaritmo é " + loga(L, b));
            z = loga(L, b);
        }
        
        System.out.println("\nZ = " + z);
    }
    
    public static double loga(double L, double b) {
        return Math.log(L) / Math.log(b);
    }
}
