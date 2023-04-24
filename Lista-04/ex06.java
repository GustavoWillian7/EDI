import java.util.*;

public class ex06 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        Random r = new Random();

        // Sorteia 1000 números positivos e 1000 números negativos e adiciona na fila
        for (int i = 0; i < 1000; i++) {
            fila.add(r.nextInt(1000) + 1); // números positivos
            fila.add(-r.nextInt(1000) - 1); // números negativos
        }

        // Processa a fila e a pilha
        while (!fila.isEmpty()) {
            int num = fila.remove();

            if (num > 0) { // número positivo
                pilha.push(num);
            } else { // número negativo
                if (!pilha.isEmpty()) {
                    System.out.println("Número no topo da pilha: " + pilha.pop());
                }
            }
        }
    }
}
