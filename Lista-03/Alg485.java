import java.util.Scanner;

public class Alg485 {
    public static void main(String[] args) {
        int[] num = new int[6];
        String[] num1 = new String[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um caractere para a posição " + i + ": ");
            num1[i] = input.next();
        }

        multivetor(num, num1, 6);

        System.out.println();
    }

    public static void multivetor(int[] num, String[] num1, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < num[i]; j++) {
                System.out.print(num1[i]);
            }
            System.out.println();
        }
    }
}
