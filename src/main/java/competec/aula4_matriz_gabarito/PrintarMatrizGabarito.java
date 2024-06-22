package competec.aula4_matriz_gabarito;

public class PrintarMatrizGabarito {
    public static void main(String[] args) {
        // Definindo uma matriz 3x3
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Iterando sobre a matriz e printando seus elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // pular linha para ficar no formato da matriz
        }
    }
}
