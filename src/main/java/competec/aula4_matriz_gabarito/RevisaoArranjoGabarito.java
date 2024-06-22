package competec.aula4_matriz_gabarito;

import java.util.Scanner;

public class RevisaoArranjoGabarito {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int maior, menor;

        maior = menor = numeros[0] = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] < menor) menor = numeros[i];
            if (numeros[i] > maior) maior = numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
