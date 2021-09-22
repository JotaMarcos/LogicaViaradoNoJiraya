package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia da semana de 1 até 7: ");
        int diaDaSemana = teclado.nextInt();

        if(diaDaSemana == 1){
            System.out.println("Segunda-feira");
        } else if(diaDaSemana == 2){
            System.out.println("Terça-feira");
        } else if(diaDaSemana == 3){
            System.out.println("Quarta-feira");
        } else if(diaDaSemana == 4){
            System.out.println("Quinta-feira");
        } else if(diaDaSemana == 5){
            System.out.println("Sexta-feira");
        } else if(diaDaSemana == 6){
            System.out.println("Sábado");
        }  else if(diaDaSemana == 7){
            System.out.println("Domingo");
        }
        else {
            System.out.println("Dia Inválido!");
        }





    }
}
