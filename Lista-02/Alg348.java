import java.util.Scanner;

public class Alg348 {
    public static void main(String[] args) {
        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];

        Scanner sc = new Scanner(System.in);

        // Trecho de entrada
        for (L = 0; L <= 4; L++) {
            System.out.print("Digite o " + (L + 1) + "º nome: ");
            nomes[L] = sc.nextLine();
            System.out.print("Digite a 1ª nota: ");
            pr1[L] = sc.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            pr2[L] = sc.nextDouble();
            sc.nextLine(); // limpa o buffer do teclado
            media[L] = (pr1[L] + pr2[L]) / 2;
        }

        // Trecho de saída
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L <= 4; L++) {
            System.out.printf(" %d - %s\n%.2f\t%.2f\t%.2f\n", L + 1, nomes[L], pr1[L], pr2[L], media[L]);
        }

        sc.close();
    }
}