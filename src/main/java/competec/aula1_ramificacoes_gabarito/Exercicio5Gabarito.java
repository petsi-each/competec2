package competec.aula1_ramificacoes_gabarito;

// 1. Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, caso contrário, imprima FALSO.

import java.util.Scanner;

public class Exercicio5Gabarito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        boolean multiploDe3 = numero % 3 == 0;
        boolean multiploDe5 = numero % 5 == 0;

        boolean resultado = multiploDe3 || multiploDe5;
        System.out.println(resultado);
    }
}
