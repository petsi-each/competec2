import java.io.IOException;
import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) throws IOException {
        //Declarando as variáveis
        //Scanner para leitura
        Scanner leitor = new Scanner(System.in); 
        //Declarando variáveis
        float nota1 = leitor.nextFloat();
        float nota2 = leitor.nextFloat();
        float nota3 = leitor.nextFloat();
        float nota4 = leitor.nextFloat();
        //Declarando possível nota extra
        float notaExtra;
        //Calculando media com os pesos
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int peso4 = 1;
        float media = (nota1*peso1 + nota2*peso2 + nota3*peso3 + nota4*peso4)/(peso1+peso2+peso3+peso4);
        System.out.printf("Media: " + String.format("%.1f%n", media));
        //início das comparações
        if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if(media <= 6.9){
            System.out.println("Aluno em exame.");
            notaExtra = leitor.nextFloat();
            System.out.printf("Nota do exame: " + String.format("%.1f%n",notaExtra));
            if(notaExtra >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            media = (media + notaExtra)/2;
            System.out.printf("Media final: "+ String.format("%.1f%n",media));
        }
        else{
            System.out.println("Aluno aprovado.");
        }

    }

}