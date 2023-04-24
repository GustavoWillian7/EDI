import java.util.*;

public class ex02 {
    public static void removeItem(Stack<Integer> pilha, int chave) {
        Stack<Integer> auxiliar = new Stack<>();
        boolean encontrado = false;

        // Percorre a pilha até encontrar o item com chave c
        while (!pilha.isEmpty()) {
            int item = pilha.pop();
            if (item == chave) {
                encontrado = true;
                break;
            } else {
                auxiliar.push(item);
            }
        }

        // Remove o item com chave c da pilha
        if (encontrado) {
            while (!auxiliar.isEmpty()) {
                pilha.push(auxiliar.pop());
            }
        }

        // Caso contrário, restaura a pilha original
        else {
            while (!auxiliar.isEmpty()) {
                pilha.push(auxiliar.pop());
            }
            System.out.println("Item com chave " + chave + " não encontrado na pilha.");
        }
    }

    public static void main(String[] args) {
        // Cria uma pilha com alguns itens de exemplo
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(7);
        pilha.push(1);
        pilha.push(8);

        // Remove o item com chave 7 da pilha
        removeItem(pilha, 7);

        // Imprime a pilha resultante
        System.out.println(pilha);
    }
}
