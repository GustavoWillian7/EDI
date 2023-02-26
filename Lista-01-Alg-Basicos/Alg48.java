import java.util.Scanner;

public class Alg48 {
    public static void main(String[] args) {
        float sm, qtd, preco, vp, vd;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o salario minimo: ");
        sm = scan.nextFloat();
        System.out.println("\nEntre com a quantidade em quilowatt: ");
        qtd = scan.nextFloat();
        preco = sm / 700;
        vp = preco * qtd;
        vd = (float) (vp * 0.9);
        System.out.println("\nPreco do quilowatt: " + preco + "\nValor a ser pago: " + vp + "\nValor com desconto: " + vd + "\n");
        scan.close();
    }
}