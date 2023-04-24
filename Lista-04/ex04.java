import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex04 {

    public static Queue<Integer> inverterFila(Queue<Integer> F1) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> F2 = new LinkedList<>();

        // Retira cada elemento da fila e empilha na pilha
        while (!F1.isEmpty()) {
            pilha.push(F1.poll());
        }

        // Desempilha cada elemento da pilha e adiciona na nova fila F2
        while (!pilha.isEmpty()) {
            F2.offer(pilha.pop());
        }

        return F2;
    }

    public static void main(String[] args) {
        // Cria uma fila com 100 números aleatórios
        Queue<Integer> F1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            F1.offer((int)(Math.random() * 100));
        }

        // Inverte a fila F1 para criar a nova fila F2
        Queue<Integer> F2 = inverterFila(F1);

        // Imprime a fila F1 original
        System.out.println("Fila F1:");
        for (int num : F1) {
            System.out.print(num + " ");
        }

        // Imprime a nova fila F2, que é a inversão de F1
        System.out.println("\nFila F2 (inversão de F1):");
        for (int num : F2) {
            System.out.print(num + " ");
        }
    }
}
