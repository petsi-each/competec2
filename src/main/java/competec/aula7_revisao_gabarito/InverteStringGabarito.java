package competec.aula7_revisao_gabarito;

public class InverteStringGabarito {
    public static void main(String[] args) {
        String palavra = "Java"; // Modifique a palavra conforme necessário
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
