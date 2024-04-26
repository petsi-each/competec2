package competec.aula2_loops_gabarito;

import java.util.Scanner;

public class Desafio12Gabarito {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String senha = "senha123"; // esta é a senha correta
		String tentativa = "";

		// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.
		while (senha.equals(tentativa) == false) {
			tentativa = scanner.next();
			if (senha.equals(tentativa)) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Senha Inválida");
			}
		}
		
	}
}
