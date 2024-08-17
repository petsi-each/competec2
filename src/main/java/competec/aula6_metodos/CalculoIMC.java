package competec.aula6_metodos;

public class CalculoIMC {
  public static void main(String[] args) {
    double peso1 = 70.5;  // em kg
    double altura1 = 1.75; // em metros
    double peso2 = 85.0;
    double altura2 = 1.80;
    double peso3 = 95.0;
    double altura3 = 1.65;

    double imc1 = peso1 / (altura1 * altura1);

    double imc2 = peso2 / (altura2 * altura2);

    double imc3 = peso3 / (altura3 * altura3);

    System.out.println("O IMC para o peso " + peso1 + " kg e altura " + altura1 + " m é: " + imc1);
    System.out.println("O IMC para o peso " + peso2 + " kg e altura " + altura2 + " m é: " + imc2);
    System.out.println("O IMC para o peso " + peso3 + " kg e altura " + altura3 + " m é: " + imc3);
  }
}
