import java.util.Scanner;

public class Alg356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        
        // trecho de entrada de 15 nomes
        for (L = 0; L <= 14; L++) {
            System.out.print("\n\nDigite " + (L + 1) + "o nome: ");
            nomes[L] = sc.nextLine();
            while (nomes[L].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres!");
                System.out.print("\n\nDigite " + (L + 1) + "o nome: ");
                nomes[L] = sc.nextLine();
            }
            // trecho que garante todos os nomes com 30 caracteres para fazer tabulação
            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++) {
                nomes[L] += " ";
            }
            System.out.print("Digite a 1a nota: ");
            pr1[L] = sc.nextDouble();
            System.out.print("Digite a 2a nota: ");
            pr2[L] = sc.nextDouble();
            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);
            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
            sc.nextLine();
        }
        // fim do trecho de entrada
        
        // trecho de saída
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL");
        for (L = 0; L <= 14; L++) {
            System.out.printf("\n%2d- %s\t%.1f\t%.1f\t%2d\t%s", L + 1, nomes[L], pr1[L], pr2[L], media[L], sit[L]);
        }
        System.out.println("\n");
        // fim do trecho de saída
    }
}
