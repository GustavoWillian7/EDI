import java.util.Scanner;

public class Alg490 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra em letras minúsculas " + i + ": ");
            nome[i] = sc.next();
            nome[i] = restantes(nome[i], nome[i].length(), "c");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + nome[i]);
        }
    }
    
    public static String restantes(String s, int n, String c) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            if (!s.substring(i, i+1).equals(c)) {
                resultado += s.substring(i, i+1);
            }
        }
        return resultado;
    }
}
