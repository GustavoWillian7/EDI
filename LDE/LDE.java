import java.util.Random;

class No {
    int data;
    No anterior;
    No proximo;

    No (int data) {
        this.data = data;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDuplamenteEncadeada {
    No inicio;

    void inserirAleatorio (int data) {
        No novoNo = new No(data);

        //verifica se a lista está vazia
        if (inicio == null) {
            inicio = novoNo;
            return;
        }
        //verifica se o novo número é menor que o valor do primeiro nó
        if (data < inicio.data) {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
            return;
        }

        //Loop que percorre a lista para inserir novo número, que avança para o próximo nó enquanto o valor do próximo nó for menor que o novo número
        No atual = inicio;
        while (atual.proximo != null && atual.proximo.data < data) {
            atual = atual.proximo;
        }

        //Ajusta a ligação entre os nós, fazendo o novo nó ser inserido no nó atual e antes do próximo nó
        novoNo.proximo = atual.proximo;
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        }
        atual.proximo = novoNo;
        novoNo.anterior = atual;
    }

    void removerPrimos() {
        No atual = inicio;

        while (atual != null) {
            if (Primo(atual.data)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                }
            }
            atual = atual.proximo;
        }
    }

    boolean Primo(int nmr) {
        if (nmr <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(nmr); i++) {
            if (nmr % 1 == 0) {
                return false;
            }
        }
        return true;
    }

    void printCrescente() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    void printDecrescente() {
        No atual = inicio;

        while (atual != null && atual.proximo != null) {
            atual = atual.proximo;
        }

        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.anterior;
        }

        System.out.println();
    }
}

public class LDE {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(1000, -9999, 9999);
        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();

        for (int number : numbers) {
            list.inserirAleatorio(number);
        }

        System.out.println("Lista crescente: ");
        list.printCrescente();
        System.out.println("************************************************************* FIM ******************************************************************************\n");

        System.out.println("Lista decrescente: ");
        list.printDecrescente();
        System.out.println("************************************************************* FIM ******************************************************************************\n");

        list.removerPrimos();

        System.out.println("Lista sem numeros primos e em ordem crescente: ");
        list.printCrescente();
        System.out.println("************************************************************* FIM ******************************************************************************\n");
    }

    static int[] generateRandomNumbers(int cont, int min, int max) {
        int[] numbers = new int[cont];
        Random random = new Random();

        for (int i = 0; i < cont; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }

        return numbers;
    }
}
