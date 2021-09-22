package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Atleta: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade do Atleta: ");
        int idade = teclado.nextInt();

        if (idade <= 10) {
            System.out.println("Atetla: "  + nome + " com idade de: " + idade + " anos. " + "A qual é menor que 10 anos participará da categoria Infatil.");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Atetla: "  + nome + " com idade de : " + idade + " anos. " + "A qual está entre 11 e 15 anos participará da categoria Juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Atetla: "  + nome + " com idade de: " + idade + " anos. " + "A qual está entre 16 e 19 anos participará da categoria Pré-adulto.");
        } else {
            System.out.println("Atetla: "  + nome + " com idade de: " + idade + " anos. " + "A qual está acima de 20 anos participará da categoria Adulto.");
        }


    }
}
