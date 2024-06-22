package competec.aula4_matriz_gabarito;

import java.util.Scanner;

public class DeclaracaoMatrizGabarito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 30, numDisciplinas = 3;

        //Opção 1:
        int notas[][] = new int[numAlunos][numDisciplinas];
        // Qual o significado de uma linha na sua matriz?
        // R: Cada linha armazena as notas de todas as disciplinas que cada aluno obteve. Linhas diferentes representam alunos diferentes.


        //Opção 2:
        notas = new int[numDisciplinas][numAlunos];
        // Qual o significado de uma linha na sua matriz?
        // R: Cada linha armazena as notas de todos os alunos para determinada disciplina. Linhas diferentes representam disciplinas diferentes.
    }
}
