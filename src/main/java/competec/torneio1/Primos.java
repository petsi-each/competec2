
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        for(int i = 1; i <= numero; i+=2){
            System.out.println(i);
        }

    }
}
