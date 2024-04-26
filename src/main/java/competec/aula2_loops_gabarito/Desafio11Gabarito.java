package competec.aula2_loops_gabarito;

public class Desafio11Gabarito {
	public static void main(String[] args) {
		int soma = 0; // inicialmente a soma é zero.

		// crie um loop que atualize o valor de soma 100 vezes
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}

		// imprima o valor da soma 
		System.out.println(soma);
	}
}
