import java.util.Scanner;
public class calcularfatorial {
    public static void main(String[] args) {
        Scanner foda = new Scanner(System.in);

        System.out.print(" mande o numero para fatoração: ");

        int numero = foda.nextInt();
        if(numero > 0){
            System.out.print("o número necessita ser >= 0 ");
        }
        long resposta = metodo(numero);

        System.out.println("fatorial " + numero + "! = " + resposta);

    }

    public static int metodo(int in) {

        int resposta = 1;
        for (int i = 1; i <= in; i++) {
            resposta *= i;

        }
        return resposta;
    }
}