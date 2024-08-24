package competec.aula7_revisao_gabarito;

// Caso queria uma demonstração visual do BubbleSort: https://visualgo.net/en/sorting

public class OrdenaArrayGabarito {
    public static void main(String[] args) {
        int[] numeros = {10, 3, 7, 2, 5, 8, 1, 4, 9, 6}; // Modifique os valores conforme necessário

        // Implementação do Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
