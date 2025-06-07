import java.util.Scanner;

public class jonathan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          double salario = 1518;
          double KHW= salario/5;
          double ValorKHW= salario/(KHW/5);
          double desconto = KHW * 0.15;
          double total = salario + desconto;

          System.out.printf("O Valor do salario minimo atual é: R$ %.2f",salario);
          System.out.printf("\nO valor pago por quillowatt é: R$%.2f", ValorKHW);
          System.out.printf("\nO valor a ser pago pelo consumo é: R$%.2f ",KHW);
          System.out.printf("\nO valor a ser pago com o desconto é: R$%.2f ", total);
        sc.close();//terminar
    }
}
