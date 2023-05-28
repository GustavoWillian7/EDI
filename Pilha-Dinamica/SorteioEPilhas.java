import java.util.Random;
import java.util.Stack;

public class SorteioEPilhas {
    public static void main(String[] args) {
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        // Fase 1: Sorteio de 100 números de 1 a 9 e armazenamento nas pilhas correspondentes
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int numeroSorteado = random.nextInt(9) + 1;
            if (numeroSorteado >= 1 && numeroSorteado <= 3) {
                pilha1.push(numeroSorteado);
            } else if (numeroSorteado >= 4 && numeroSorteado <= 6) {
                pilha2.push(numeroSorteado);
            } else {
                pilha3.push(numeroSorteado);
            }
        }

        // Fase 2: Sorteio de 100 números de 1 a 3 e empilhamento nas pilhas conforme sorteio
        for (int i = 0; i < 100; i++) {
            int numeroSorteado = random.nextInt(3) + 1;
            Stack<Integer> pilhaSelecionada;
            String nomePilha;

            if (numeroSorteado == 1) {
                pilhaSelecionada = pilha1;
                nomePilha = "Pilha 1";
            } else if (numeroSorteado == 2) {
                pilhaSelecionada = pilha2;
                nomePilha = "Pilha 2";
            } else {
                pilhaSelecionada = pilha3;
                nomePilha = "Pilha 3";
            }

            if (pilhaSelecionada.isEmpty()) {
                System.out.println("O programa foi encerrado porque a " + nomePilha + " está vazia.");
                break;
            }

            int numeroTopo = pilhaSelecionada.pop();
            System.out.println("Empilhando o número " + numeroTopo + " na " + nomePilha);

            // Verifica se todas as pilhas estão vazias
            if (pilha1.isEmpty() && pilha2.isEmpty() && pilha3.isEmpty()) {
                System.out.println("O programa foi encerrado porque todas as pilhas estão vazias.");
                break;
            }
        }

        // Impressão das pilhas
        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
    }
}
