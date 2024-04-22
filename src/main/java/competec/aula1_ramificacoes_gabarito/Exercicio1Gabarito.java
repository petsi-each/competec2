package competec.aula1_ramificacoes_gabarito;

// O Sr João precisa de um programa para calcular o valor das compras da sua lojinha
// de frutas, que vende apenas três produtos: abacaxi, maçã e pêra;
// As frutas custam R$ 7,30, R$ 2,00 e R$ 3,00, respectivamente;
// 1. Faça um programa que pegue a quantidade de cada fruta comprada e retorne o valor total da compra;

public class Exercicio1Gabarito {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        int abacaxi = 2;
        int maca = 3;
        int pera = 4;

        double valorAbacaxi = 7.30;
        double valorMaca = 2.00;
        double valorPera = 3.00;

        double total = (abacaxi * valorAbacaxi) + (maca * valorMaca) + (pera * valorPera);

        System.out.println("O valor total da compra é: R$ " + total);
    }
}
