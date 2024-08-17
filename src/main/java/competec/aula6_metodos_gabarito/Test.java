package competec.aula6_metodos_gabarito;

public class Test {

  public static void imprimeQuadrado(int lado) {
    for (int i = 0; i < lado; i++) {
      for (int j = 0; j < lado; j++) {
        System.out.println("#");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    imprimeQuadrado(4);
  }}
