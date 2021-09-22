package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int numero = scan.nextInt();
        int i = 0;
        while(i <= numero){
           if (i % 2 != 0){
               System.out.println("O valor de i: " + i);
           }
           i = i + 1;
        }
    }
}
