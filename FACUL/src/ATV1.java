import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não pode ser calculado para números negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    public static int calcularFatorial(int z) {
        if (z == 0) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 1; i <= z; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}