import java.util.Random;
import java.util.Stack;

public class ex08 {
    public static void main(String[] args) {
        Stack<Integer> pilhaP = new Stack<>();
        Stack<Integer> pilhaN = new Stack<>();
        Random rand = new Random();

        // Sorteia 1000 números entre -100 e 100
        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(201) - 100; // números variando entre -100 e 100
            if (num > 0) {
                pilhaP.push(num);
            } else if (num < 0) {
                pilhaN.push(num);
            } else { // num == 0
                if (!pilhaP.isEmpty()) {
                    System.out.println("Número retirado da pilha P: " + pilhaP.pop());
                } else {
                    System.out.println("Pilha P vazia.");
                }
                if (!pilhaN.isEmpty()) {
                    System.out.println("Número retirado da pilha N: " + pilhaN.pop());
                } else {
                    System.out.println("Pilha N vazia.");
                }
            }
        }
    }
}
