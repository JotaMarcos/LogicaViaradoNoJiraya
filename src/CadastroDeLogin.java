import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu usuário: ");
        String nome = teclado.nextLine();
        if(nome.equals(null) || nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Inválido!!!");
        } else {
            System.out.println("Usuário Cadastrado com Sucesso!!! \\o/\\o/\\o/");
        }

        System.out.println("Digite a sua Senha: ");
        String senha = teclado.next();

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        System.out.println("O Valor Hash é: " + messageDigest);


        if (senha.equals(null) || senha.equals("") || senha.equalsIgnoreCase("admin")  || senha.equalsIgnoreCase("administrador")){
            System.out.println("Senha Inválida!!!");
        } else {
            System.out.println("Senha Cadastrada com Sucesso!!! \\o/\\o/\\o/");
        }

    }
}
