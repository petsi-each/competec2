package competec.aula2_loops_gabarito;

import java.util.Scanner;

public class Desafio21Gabarito {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}
}
