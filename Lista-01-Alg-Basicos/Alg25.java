import java.util.Scanner;

public class Alg25 {
    public static void main(String[] args) {
        int data,dia,mes,ano;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite data no formato ddmmaa: ");
        data = scan.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println("\nDIA: " + dia + "\nMES: " + mes + "\nANO: " + ano + "\n");
        scan.close();
    }
}