package competec.aula1_ramificacoes_gabarito;

// 1. Se estiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código
// 2. Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! Tente fazer essa comparação lógica no código.

public class Exercicio3Gabarito {
    public static void main(String[] args) {
        boolean estaChovendo = true;
        boolean estaRelampejando = true;
        boolean temMacarrao = true;
        boolean temEstrogonofe = false;

        if (estaChovendo && estaRelampejando) {
            System.out.println("Não sairei de casa");
        }

        if (temMacarrao || temEstrogonofe) {
            System.out.println("Vou ficar muito feliz!");
        }
    }
}
