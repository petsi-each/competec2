package competec.aula1_ramificacoes_gabarito;

// Suponha duas pessoas, A e B:
// 1. Faça uma comparação lógica para ver se A e B têm a mesma idade E A tem mais de 18 anos.
// 2. Faça uma comparação lógica para ver se A e B têm idades diferentes E se B tem menos de 12 anos.

public class Exercicio4Gabarito {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        int idadeA = 20;
        int idadeB = 20;

        boolean mesmaIdadeEMaiorDe18 = idadeA == idadeB && idadeA > 18;
        System.out.println(mesmaIdadeEMaiorDe18);

        boolean idadesDiferentesEMenorDe12 = idadeA != idadeB && idadeB < 12;
        System.out.println(idadesDiferentesEMenorDe12);
    }
}
