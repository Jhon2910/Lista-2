import java.util.Scanner;
class jonathan3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digíte o primeiro valor:");
        double num1 = teclado.nextDouble();
        System.out.println("Digíte o segundo valor:");
        double num2 = teclado.nextDouble();
        System.out.println("Digíte o terceiro valor:");
        double num3 = teclado.nextDouble();
        double mult = num1 * num2 ;
        double div = mult/num3;
        System.out.printf("Resultado:%2.f%",div);
        teclado.close();
    }
}
