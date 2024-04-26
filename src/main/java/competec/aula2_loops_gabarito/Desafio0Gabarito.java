package competec.aula2_loops_gabarito;

import java.util.Scanner;

public class Desafio0Gabarito {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// leia o número inteiro enviado pelo usuário utilizando o scanner.
		int numeroLido = scanner.nextInt();

		// teste se o número é par. Dica: lembre-se do operador '%', que retorna o resto da divisão entre dois números.
		boolean ehPar = (numeroLido % 2 == 0);
		
		// imprima o resultado da operação (se o número digitado é par ou ímpar).
		if (ehPar) {
			System.out.println("É par");
		} else {
			System.out.println("É ímpar");
		}
	}
}
