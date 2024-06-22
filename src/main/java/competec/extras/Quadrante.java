package org.example;

public class Quadrante {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);

        var x = scanner.nextInt();
        var y = scanner.nextInt();

        while (x != 0 && y != 0) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }
    }
}
