package competec.aula7_revisao_gabarito;

public class MediaArrayGabarito {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Modifique os valores conforme necessário
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = soma / (double) numeros.length;
        System.out.println("A média dos números é: " + media);
    }
}
