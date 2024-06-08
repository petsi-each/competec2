import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Quadrante {
 
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int x,y;
        do{
            x = leitor.nextInt();
            y = leitor.nextInt();
            if(x > 0 && y > 0) System.out.println("primeiro");
            if(x < 0 && y > 0) System.out.println("segundo");
            if(x < 0 && y < 0) System.out.println("terceiro");
            if(x > 0 && y < 0) System.out.println("quarto");
        }while(x != 0 && y != 0);
 
    }
 
}