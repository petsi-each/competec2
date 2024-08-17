package competec.aula6_metodos_gabarito;

public class SomaDosQuadradosGabarito {
  public static void main(String[] args) {
    int numero1 = 3, numero2 = 4;
    int numero3 = 5, numero4 = 6;
    int numero5 = 7, numero6 = 8;

    int resultado1 = calcularSomaDosQuadrados(numero1, numero2);
    int resultado2 = calcularSomaDosQuadrados(numero3, numero4);
    int resultado3 = calcularSomaDosQuadrados(numero5, numero6);

    System.out.println("A soma dos quadrados de " + numero1 + " e " + numero2 + " é: " + resultado1);
    System.out.println("A soma dos quadrados de " + numero3 + " e " + numero4 + " é: " + resultado2);
    System.out.println("A soma dos quadrados de " + numero5 + " e " + numero6 + " é: " + resultado3);
  }

  // Método auxiliar para evitar repetição
  static int calcularSomaDosQuadrados(int x, int y) {
    return (x * x) + (y * y);
  }
}
