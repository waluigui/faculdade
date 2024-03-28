import java.util.Scanner;
public class ATV2 {
    public static void main(String[] args) {
        int p;
        System.out.println("fale um numero:");
        Scanner foda = new Scanner(System.in);
        p = foda.nextInt();
        if(p % 2 == 0){
            System.out.println("o numero " + p + " é par ora pois");
        }
        else{
            System.out.println("o numero " + p + " é impar ora pois");
        }
    }
}