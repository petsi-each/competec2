import java.util.Scanner;
public class Salario {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int numero_funcionario = leitor.nextInt();
        int horas_trabalhadas = leitor.nextInt(); 
        double valor_hora = leitor.nextDouble();

        double salario = horas_trabalhadas * valor_hora;
        System.out.println("NUMBER = " + numero_funcionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));        
    }
}
