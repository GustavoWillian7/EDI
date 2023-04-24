import java.util.*;

public class ex05 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Set<Integer> numeros = new HashSet<>();
        
        Random random = new Random();
        
        // sorteia 1000 números aleatórios e insere na fila ou na pilha
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(1000) + 1; // sorteia número entre 1 e 1000
            
            if (numeros.contains(numero)) {
                pilha.push(numero); // número já presente na fila, insere na pilha
            } else {
                fila.add(numero); // número não presente na fila, insere na fila
                numeros.add(numero);
            }
        }
        
        // imprime a fila e a pilha
        System.out.println("Fila F: " + fila);
        System.out.println("Pilha P: " + pilha);
    }
}
