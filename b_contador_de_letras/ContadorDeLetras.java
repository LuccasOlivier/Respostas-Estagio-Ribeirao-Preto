package b_contador_de_letras;
import java.util.Scanner;

public class ContadorDeLetras {

    // Função para contar ocorrências da letra 'a' (maiúscula e minúscula) em uma string
    public static int contarLetraA(String input) {
        int count = 0;
        // Converter a string para minúsculas para facilitar a contagem
        String lowerCaseInput = input.toLowerCase();
        
        // Contar quantas vezes a letra 'a' ocorre
        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");

        try {
            String input = scanner.nextLine();
            int count = contarLetraA(input);
            System.out.println("A letra 'a' (maiúscula e minúscula) ocorre " + count + " vezes na string informada.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a string.");
        } finally {
            scanner.close();
        }
    }
}
