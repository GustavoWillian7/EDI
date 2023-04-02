import java.util.Scanner;

public class Alg358 {
    public static void main(String[] args) {
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        int totLucroMenor10 = 0;
        int totLucroMenor20 = 0;
        int totLucroMaior20 = 0;

        Scanner sc = new Scanner(System.in);

        for (int A = 0; A < 100; A++) {
            System.out.print("\nPreco de compra: ");
            precoCompra[A] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            precoVenda[A] = sc.nextDouble();
        }

        for (int A = 0; A < 100; A++) {
            double lucro = precoVenda[A] - precoCompra[A];
            if (lucro < 10.0) {
                totLucroMenor10++;
            } else if (lucro <= 20.0) {
                totLucroMenor20++;
            } else {
                totLucroMaior20++;
            }
        }

        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);
    }
}
