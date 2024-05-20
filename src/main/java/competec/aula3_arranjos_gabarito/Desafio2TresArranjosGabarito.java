package competec.aula3_arranjos_gabarito;

public class Desafio2TresArranjosGabarito {
    public static void main(String[] args) {
        // Crie um vetor com 3 números inteiros a sua escolha:
        int valores[] = new int[3];
        valores[0] = 2;
        valores[1] = 4;
        valores[2] = 6;

        // Crie uma variável que irá armazenar a soma desses 3 valores:
        int somaValores = valores[0] + valores[1] + valores[2];

        // Imprima o resultado dessa variável:
        System.out.printf("A soma dos 3 valores eh: %d\n", somaValores);

        // Faça uma estrutura de repeticao for ou while que imprima cada um dos valores
        // while:
        System.out.println("Valores impressos utilizando while");
        int contador = 0;
        while (contador != valores.length) {
            System.out.printf("Valor %d: %d\n", contador, valores[contador]);
            contador++;
        }

        // for:
        System.out.println("Valores impressos utilizando for");
        for (contador = 0; contador != valores.length; contador++) {
            System.out.printf("Valor %d: %d\n", contador, valores[contador]);
        }

    }
}
