import java.util.Scanner;

public class Alg346 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int op, x, tam;

        do {
            System.out.println("\nMENU");
            System.out.println("\n1 - Imprime o comprimento da frase");
            System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("\n3 - Imprime a frase espelhada");
            System.out.println("\n4 - Termina o algoritmo");
            System.out.println("\nOPCAO:");
            op = input.nextInt();
            
            switch(op) {
               case 1:
                  System.out.println("\nDigite uma frase:");
                  frase = input.next();
                  tam = frase.length();
                  System.out.println("\nnumero de caracteres da frase: " + tam);
                  break;
               case 2:
                  System.out.println("\nDigite uma frase:");
                  frase = input.next();
                  System.out.println("\nos dois primeiros caracteres: " + frase.substring(0, 2));
                  tam = frase.length() - 2;
                  System.out.println("\nos dois ultimos caracteres: " + frase.substring(tam));
                  break;
               case 3:
                  System.out.println("\nDigite uma frase:");
                  frase = input.next();
                  for(x = frase.length() - 1; x >= 0; x--) {
                     System.out.print(frase.charAt(x));
                  }
                  System.out.println();
                  break;
               case 4:
                  System.out.println("\nFim do algoritmo");
                  break;
               default:
                  System.out.println("\nopcao nao disponivel");
                  break;
            }
            System.out.println("\n\n");
         } while(op != 4);       
    }
}
