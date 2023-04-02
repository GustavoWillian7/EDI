import java.util.Scanner;

public class Alg351 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String[] nomes = new String[5];

        // Entrada de nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("\nNome " + (i+1) + ": ");
            nomes[i] = input.nextLine();
        }

        // Entrada do número para procurar a posição
        System.out.print("\nDigite o número da pessoa: ");
        num = input.nextInt();

        // Verificação se o número está dentro do intervalo
        while(num < 1 || num > 5) {
            System.out.println("\nNúmero fora do intervalo");
            System.out.print("\nDigite o número da pessoa: ");
            num = input.nextInt();
        }

        // Saída do nome na posição correspondente
        System.out.println("\n" + nomes[num-1]);
    }
}
