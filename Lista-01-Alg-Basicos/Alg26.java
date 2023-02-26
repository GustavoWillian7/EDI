import java.util.Scanner;

public class Alg26 {
    public static void main(String[] args) {
        int data, dia, mes, ano, ndata;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite a data no formato DDMMAA: ");
        data = scan.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes * 10000 + dia * 100 + ano;
        System.out.println("\nDIA: " + dia + "\nMES: " + mes + "\nANO: " + ano + "\nDATA NO FORMATO MMDDAA: " + ndata + "\n");
        scan.close();
    }
}