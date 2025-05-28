import java.util.Scanner;
class jonathan4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digíte o primeiro valor:");
        double num1 = teclado.nextDouble();
        System.out.println("Digíte o primeiro peso:");
        double peso1 = teclado.nextDouble();
        System.out.println("Digíte o segundo valor:");
        double num2 = teclado.nextDouble();
        System.out.println("Digíte o segundo peso:");
        double peso2 = teclado.nextDouble();
        System.out.println("Digíte o terceiro valor:");
        double num3 = teclado.nextDouble();
        System.out.println("Digíte o terceiro peso :");
        double peso3 = teclado.nextDouble();
        double numpeso = num1 * peso1 + num2 * peso2 + num3 * peso3;
        double peso =peso1 + peso2 + peso3;
        double media = numpeso / peso;
        System.out.println("A média ponderada é" +media);
        teclado.close();
    }
}
