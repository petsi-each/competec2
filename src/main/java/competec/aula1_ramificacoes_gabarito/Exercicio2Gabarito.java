package competec.aula1_ramificacoes_gabarito;

// 1. Compare o seu nome com o nome do colega ao lado e veja se são iguais
// 2. Faça uma comparação para descobrir se você é mais novo que o professor;

public class Exercicio2Gabarito {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        String meuNome = "João";
        String nomeColega = "Maria";

        int minhaIdade = 16;
        int idadeProfessor = 30;

        boolean nomesIguais = meuNome.equals(nomeColega);
        System.out.println(nomesIguais);

        boolean souMaisNovoQueProfessor = minhaIdade < idadeProfessor;
        System.out.println(souMaisNovoQueProfessor);
    }
}
