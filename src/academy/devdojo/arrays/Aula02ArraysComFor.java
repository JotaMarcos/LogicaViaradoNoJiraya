package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + " : " + notas[i]);
        }
        System.out.println("A Soma das Notas: " + media);

        media = media / notas.length;
        System.out.println("A Média das Notas é: " + media);
    }
}
