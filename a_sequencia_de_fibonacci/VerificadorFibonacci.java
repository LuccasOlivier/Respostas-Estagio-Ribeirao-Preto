package a_sequencia_de_fibonacci;
import java.util.Scanner;

public class VerificadorFibonacci {

    // Função para calcular a sequência de Fibonacci e verificar se o número pertence à sequência
    public static boolean isInFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        int a = 0, b = 1;
        if (number == a || number == b) {
            return true;
        }

        int fib = a + b;
        while (fib <= number) {
            if (fib == number) {
                return true;
            }
            a = b;
            b = fib;
            fib = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");

        try {
            int number = scanner.nextInt();
            if (isInFibonacci(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, informe um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
