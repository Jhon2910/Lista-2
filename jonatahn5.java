import java.util.Scanner;
class jonathan5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário em (R$):");
        double salario = teclado.nextDouble();
        double gratificacao = salario * 0.10;
        double imposto = gratificacao * 0.5;
        double receber = salario + gratificacao - imposto ;
        System.out.println("O valor a receber é :" +receber);
        teclado.close();
    }
}
