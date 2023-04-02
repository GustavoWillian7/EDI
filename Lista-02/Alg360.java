import java.util.Scanner;

public class Alg360 {
    public static void main(String[] args) {
        int[] ultdia = new int[12];
        String[] signo = new String[12];
        int data, dia, mes;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o signo: ");
            signo[i] = scanner.nextLine();
            System.out.print("Digite o ultimo dia: ");
            ultdia[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha após entrada de inteiro
        }
        
        System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
        data = scanner.nextInt();
        
        while (data != 9999) {
            dia = data / 100;
            mes = data % 100 - 1;
            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }
            System.out.println("Signo: " + signo[mes] + "\n");
            System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = scanner.nextInt();
        }
        
        scanner.close();
    }
}
