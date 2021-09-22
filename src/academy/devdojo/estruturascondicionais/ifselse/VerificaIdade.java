package academy.devdojo.estruturascondicionais.ifselse;

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 25;
        if (idade > 18){
            System.out.println("Adulto!!!");
        }else{
            System.out.println("Não é Adulto!!!");
        }
        //O inverso também funciona
        if (idade <= 18){
            System.out.println("Não é Adulto!!!");
        }else{
            System.out.println("Adulto!!!");
        }
    }
}
