import java.util.Scanner;

public class Alg487 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        
        inverte(num, 10);
        
        System.out.println("\nVETOR\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + num[i]);
        }
        System.out.println();
    }
    
    public static void inverte(int[] num, int tam) {
        int temp;
        for (int i = 0; i < tam/2; i++) {
            temp = num[i];
            num[i] = num[tam-1-i];
            num[tam-1-i] = temp;
        }
    }
    
}
