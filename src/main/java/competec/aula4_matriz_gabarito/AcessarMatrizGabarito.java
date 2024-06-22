package competec.aula4_matriz_gabarito;

public class AcessarMatrizGabarito {
    public static void main(String[] args) {
        // Criando uma matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Acessando o número do meio da matriz
        int numero = matriz[1][1];

        // Imprimindo o número
        System.out.println("O número do meio da matriz é: " + numero);
    }
}
