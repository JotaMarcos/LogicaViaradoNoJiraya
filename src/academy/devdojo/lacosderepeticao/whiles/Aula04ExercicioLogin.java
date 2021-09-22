package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================>>> INÍCIO DO PROGRAMA  <<<=======================");
        //while (exibirTelaLogin){
        while (true){
            System.out.println("Digite seu login: ");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite a sua senha: ");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("ACESSO CONCEDIDO!");
                //exibirTelaLogin = false;
                break;
            }
            System.out.println("ACESSO NEGADO!");

        }
        System.out.println("=======================>>> PROGRAMA TERMINADO <<<=======================");



    }
}
