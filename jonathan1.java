import java.util.Scanner;
public class jonathan1{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digíte o primeiro valor:");
        double num1 = teclado.nextDouble();
        System.out.println("Digíte o segundo valor:");
        double num2 = teclado.nextDouble();
        double soma = Math.pow(num1, 2) + Math.pow(num2, 2);
        double media = Math.sqrt(soma);
        System.out.printf("A média dos números é :%.2f%n",media);
    teclado.close();
        }
    }
