package academy.devdojo.arrays;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 3;
        double nota4 = 6;
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A sua Média  é: " + media);
        System.out.println("-------------------------------------------");
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3;
        notas[3] = 6;
        System.out.println("Tamanho do Array: " + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A sua nota é: " + notas[i]);
        }

        /*System.out.println("A sua Nota 1: " + notas[0]);
        System.out.println("A sua Nota 1: " + notas[1]);
        System.out.println("A sua Nota 1: " + notas[2]);
        System.out.println("A sua Nota 1: " + notas[3]);*/




    }
}
