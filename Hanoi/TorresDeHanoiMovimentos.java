import java.util.Scanner;

public class TorresDeHanoiMovimentos {
	private static void movimento(int O, int D) {
		System.out.println(O + " -> " + D);
	}

	static void hanoi(int n, int O, int D, int A) {

		if (n > 0) {
			hanoi(n - 1, O, A, D);
			movimento(O, D);
			hanoi(n - 1, A, D, O);
		}

	}
	public static void main (String[] args) {

		int n;
		double x;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = scan.nextInt();

		TorresDeHanoiMovimentos.hanoi(n, 1, 3, 2);

		x = Math.pow(2, n) - 1;
		System.out.println("Número de discos: " + n);
		System.out.println("Número total de movimentos = " + Math.round(x));
	}
}