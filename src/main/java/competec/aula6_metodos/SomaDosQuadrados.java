package competec.aula6_metodos;

public class SomaDosQuadrados {
  public static void main(String[] args) {
    int numero1 = 3;
    int numero2 = 4;
    int numero3 = 5;
    int numero4 = 6;
    int numero5 = 7;
    int numero6 = 8;

    int somaDosQuadrados1 = (numero1 * numero1) + (numero2 * numero2);

    int somaDosQuadrados2 = (numero3 * numero3) + (numero4 * numero4);

    int somaDosQuadrados3 = (numero5 * numero5) + (numero6 * numero6);

    System.out.println("A soma dos quadrados de " + numero1 + " e " + numero2 + " é: " + somaDosQuadrados1);
    System.out.println("A soma dos quadrados de " + numero3 + " e " + numero4 + " é: " + somaDosQuadrados2);
    System.out.println("A soma dos quadrados de " + numero5 + " e " + numero6 + " é: " + somaDosQuadrados3);
  }
}
