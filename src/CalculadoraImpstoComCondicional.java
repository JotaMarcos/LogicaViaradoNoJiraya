public class CalculadoraImpstoComCondicional {
    public static void main(String[] args) {
        double salario = 4700;
        double resultadoFinal = 0.0;
        String porcentagem = "";

//        if (salario > 4500){
//            double trintaPorCento = salario * 0.3;
//            System.out.println("30% do Valor do Salário é R$: " + trintaPorCento);
//
//        }else{
//            double quinzePorCento= salario * 0.15;
//            System.out.println("15% do Valor do Salário é R$: " + quinzePorCento);
//
//        }

        if (salario > 4500){
            resultadoFinal = salario * 0.3;
            porcentagem = "30%";
        }else{
            resultadoFinal = salario * 0.1;
            porcentagem = "10%";
        }

        System.out.println("O Valor do Percentual do Salário é R$: " + resultadoFinal + " e a Porcentagem é igual a: " + porcentagem);
        System.out.println();


    }
}
