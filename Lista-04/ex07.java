import java.util.*;

public class ex07 {
    public static void inverterFila(Fila<Integer> fila) {
        Pilha<Integer> pilha = new Pilha<>();

        // Empilhar os elementos da fila na pilha
        while (!fila.estaVazia()) {
            pilha.empilhar(fila.desenfileirar());
        }

        // Desempilhar os elementos da pilha na fila, invertendo a ordem
        while (!pilha.estaVazia()) {
            fila.enfileirar(pilha.desempilhar());
        }
    }

    public static void main(String[] args) {
        // Criar uma fila com 20 posições de inteiros
        Fila<Integer> fila = new Fila<>(20);

        // Sortear 20 números aleatórios e inserir na fila
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 100);
            fila.enfileirar(numero);
        }

        // Imprimir a fila original
        System.out.println("Fila original: " + fila);

        // Inverter a fila
        inverterFila(fila);

        // Imprimir a fila invertida
        System.out.println("Fila invertida: " + fila);
    }
}
