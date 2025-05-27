import java.util.Scanner;
public class jonathan3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digíte o primeiro valor:");
        int num1 = (int) teclado.nextInt();
        System.out.println("Digíte o primeiro valor:");
        int num2 = (int) teclado.nextInt();
        System.out.println("Digíte o terceiro valor:");
        int antecessor = num1 + num2 ;
        int sucessor = num1 + 1;
        System.out.println("sucessor:" +sucessor);
        System.out.println("antecessor:" +antecessor);
    teclado.close();
        }
    }
