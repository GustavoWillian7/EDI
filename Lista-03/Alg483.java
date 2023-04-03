public class Alg483 {
    public static void main(String[] args) {
        int L, c, aux;
        int[] num = new int[4];
        int[] num1 = new int[4];
        for (L = 0; L < 4; L++) {
            System.out.print("\n\nDigite 1 numero " + (L + 1) + ": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        for (L = 0; L < 4; L++) {
            System.out.print("\n\nDigite 2 numero " + (L + 1) + ": ");
            num1[L] = Integer.parseInt(System.console().readLine());
        }
        c = produtointerno(num, num1, 4);
        System.out.print("\nVETOR A\tVETORB\n");
        for (L = 0; L < 4; L++) {
            System.out.print("\n" + num[L] + "\t" + num1[L]);
        }
        System.out.print("\n\nproduto interno: " + c);
        System.out.print("\n");
    }

    public static int produtointerno(int[] A, int[] B, int tam) {
        int soma = 0;
        for (int i = 0; i < tam; i++) {
            soma += A[i] * B[i];
        }
        return soma;
    }
}
