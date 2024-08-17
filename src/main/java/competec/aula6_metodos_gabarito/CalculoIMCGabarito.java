package competec.aula6_metodos_gabarito;

public class CalculoIMCGabarito {
  public static void main(String[] args) {
    double peso1 = 70.5, altura1 = 1.75;
    double peso2 = 85.0, altura2 = 1.80;
    double peso3 = 95.0, altura3 = 1.65;

    double imc1 = calcularIMC(peso1, altura1);
    double imc2 = calcularIMC(peso2, altura2);
    double imc3 = calcularIMC(peso3, altura3);

    System.out.println("O IMC para o peso " + peso1 + " kg e altura " + altura1 + " m é: " + imc1);
    System.out.println("O IMC para o peso " + peso2 + " kg e altura " + altura2 + " m é: " + imc2);
    System.out.println("O IMC para o peso " + peso3 + " kg e altura " + altura3 + " m é: " + imc3);
  }

  // Método auxiliar para calcular o IMC
  public static double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);
  }
}
