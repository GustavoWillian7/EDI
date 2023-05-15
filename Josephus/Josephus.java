import java.io.*;
 
class Josephus {
 
    static int josephus(int n) {
        int p = 1;
        while (p <= n)
            p *= 2;
        return (2 * n) - p + 1;
    }
    public static void main(String[] args) {
        int n = 20;
        Pessoa Pessoa1 = new Pessoa("Alberto","(64)92534-1234","Rua Rio Negro","123.123.178-12");
        Pessoa Pessoa2 = new Pessoa("Bruno","(64)91237-1234","Rua Amazonas","123.123.123-00");
        Pessoa Pessoa3 = new Pessoa("Carla", "(64)91214-1234","Rua Sao Paulo","123.123.213-12");
        Pessoa Pessoa4 = new Pessoa("Daniela", "(64)97234-2234","Rua Rio Negro","123.123.155-12");
        Pessoa Pessoa5 = new Pessoa("Eduardo", "(64)91234-1734","Rua Rio Branco","183.553.123-12");
        Pessoa Pessoa6 = new Pessoa("Felipe", "(64)91234-1234","Avenida Tamandare","123.189.123-79");
        Pessoa Pessoa7 = new Pessoa("Giovana", "(64)91234-1834","Rua Rio Negro","123.121.126-12");
        Pessoa Pessoa8 = new Pessoa("Henrique", "(64)91234-3234","Rua Tefe","123.123.093-12");
        Pessoa Pessoa9 = new Pessoa("Iago", "(64)91134-1234","Rua Rio Branco","123.123.123-12");
        Pessoa Pessoa10 = new Pessoa("Joao", "(64)91734-1234","Rua","123.123.123-12");
        Pessoa Pessoa11 = new Pessoa("Kaio", "(64)91834-1234","Rua Mato Grosso","123.113.123-12");
        Pessoa Pessoa12 = new Pessoa("Larissa", "(64)91239-1234","Rua Rio Negro","123.098.223-12");
        Pessoa Pessoa13 = new Pessoa("Matheus", "(64)91134-1234","Rua Rio Negro","123.123.123-22");
        Pessoa Pessoa14 = new Pessoa("Nathan", "(64)91230-1234","Rua Acre","123.123.135-12");
        Pessoa Pessoa15 = new Pessoa("Otavio", "(64)91034-1234","Rua Rondonia","123.123.703-18");
        Pessoa Pessoa16 = new Pessoa("Patricia", "(64)90234-1234","Rua Palmas","123.123.176-12");
        Pessoa Pessoa17 = new Pessoa("Renato", "(64)91230-1234","Rua Brasilia","123.158.173-12");
        Pessoa Pessoa18 = new Pessoa("Sabrina", "(64)91004-1234","Rua Goiania","123.144.123-12");
        Pessoa Pessoa19 = new Pessoa("Thiago", "(64)91734-1234","Rua Santa Catarina","123.093.123-12");
        Pessoa Pessoa20 = new Pessoa("Ulisses", "(64)91000-1234","Rua Rio Negro","123.123.178-12");

        System.out.println("O número do lugar do sobreviventes eh: " + josephus(n));
    }
}