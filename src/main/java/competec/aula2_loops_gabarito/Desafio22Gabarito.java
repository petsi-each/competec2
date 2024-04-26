package competec.aula2_loops_gabarito;

import java.util.Scanner;

public class Desafio22Gabarito {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i+=2) {
			System.out.println(i);
		}
	}
}
