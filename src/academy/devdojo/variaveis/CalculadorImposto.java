package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculadorImposto {
    public static void main(String[] args) {
        double salario = 2500.00;
        double porcentagem = 30;
        double porcentagemDoSalario = (salario * (porcentagem / 100));


        System.out.println("A porcentagem determinada do Salário é R$: " + porcentagemDoSalario);



    }
}
