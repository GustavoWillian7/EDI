import java.util.Scanner;

public class Alg493 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            num[i] = scanner.nextInt();
        }
        
        int c = verificaOrdem(num, 10);
        
        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        } else {
            System.out.println("\nNAO ESTA ORDENADO");
        }
    }
    
    public static int verificaOrdem(int[] num, int tam) {
        int ordem = 0;
        
        if (buscal(num, tam) == 1) {
            ordem = 1;
            for (int i = 0; i < tam - 1; i++) {
                if (num[i] > num[i+1]) {
                    ordem = 0;
                    break;
                }
            }
        } else if (buscal(num, tam) == 2) {
            ordem = 2;
            for (int i = 0; i < tam - 1; i++) {
                if (num[i] < num[i+1]) {
                    ordem = 0;
                    break;
                }
            }
        }
        
        return ordem;
    }
    
    public static int buscal(int[] num, int tam) {
        int crescente = 1;
        int decrescente = 1;
        
        for (int i = 0; i < tam - 1; i++) {
            if (num[i] > num[i+1]) {
                crescente = 0;
                break;
            }
        }
        
        for (int i = 0; i < tam - 1; i++) {
            if (num[i] < num[i+1]) {
                decrescente = 0;
                break;
            }
        }
        
        if (crescente == 1) {
            return 1;
        } else if (decrescente == 1) {
            return 2;
        } else {
            return 0;
        }
    }
}
