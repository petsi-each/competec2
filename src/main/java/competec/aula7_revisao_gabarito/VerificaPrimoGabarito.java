package competec.aula7_revisao_gabarito;

public class VerificaPrimoGabarito {
    public static void main(String[] args) {
        int numero = 17; // Modifique o valor do número conforme necessário

        boolean ehPrimo = true;

        if (numero < 2) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}
