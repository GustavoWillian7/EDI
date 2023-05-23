import java.util.Stack;

public class PilhaInversaoPalavras {
    public static void main(String[] args) {
        String input1 = "ESTE EXERCICIO E MUITO FACIL";
        String input2 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String input3 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        String output1 = inverterPalavras(input1);
        String output2 = inverterPalavras(input2);
        String output3 = inverterPalavras(input3);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }

    public static String inverterPalavras(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}
