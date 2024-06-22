package competec.aula4_matriz;

import java.util.Scanner;

public class RevisaoArranjo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];
        int maior, menor;

        maior = menor = numeros[0] = scanner.nextInt(); //lê o primeiro valor do vetor e o inicializa como maior e menor até o momento

        //Insira aqui o código para ler os números do vetor e encontrar o maior e menor valores

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
