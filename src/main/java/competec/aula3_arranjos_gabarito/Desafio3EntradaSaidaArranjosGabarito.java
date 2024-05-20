package competec.aula3_arranjos_gabarito;

import java.util.Scanner;

public class Desafio3EntradaSaidaArranjosGabarito {

	public static void main(String[] args) {
		/*
		 * Desafio principal:
		 * Faça um programa que leia um número inteiro positivo N, que representa o
		 * tamanho do arranjo. Depois, leia cada valor do arranjo. Em seguida, mostre na
		 * tela todos os números que estão armazenados no arranjo.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Tamanho arranjo: ");
		int tamanhoArranjo = scanner.nextInt();
		int[] arranjo = new int[tamanhoArranjo];

		System.out.println("Preencher arranjo:");
		for (int iterador = 0; iterador < tamanhoArranjo; iterador++) {
			arranjo[iterador] = scanner.nextInt();
		}

		System.out.println("Mostrar arranjo:");
		for (int iterador = 0; iterador < tamanhoArranjo; iterador++) {
			System.out.println(arranjo[iterador]);
		}

		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */
		System.out.println("Valores invertidos:");
		int[] arranjoInvertido = new int[tamanhoArranjo];

		int decremento = tamanhoArranjo - 1;
		int incremento = 0;

		while (decremento >= 0) {
			arranjoInvertido[incremento] = arranjo[decremento];

			System.out.println(arranjoInvertido[incremento]);
			incremento++;
			decremento--;
			}

		scanner.close();

	}

}
