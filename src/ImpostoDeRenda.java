public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 4985D;
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5% R$" + (salario * 0.75));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15% R$" + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22.5% R$" + (salario * 0.225));
        } else {
            System.out.println("27.5% R$" + (salario * 0.275));
        }


    }
}
