import java.util.Scanner;
class jonathan4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário fixo");
        double salario = teclado.nextDouble();
        double comissao = salario * 0.04;
        
        System.out.println();
        teclado.close(); //continuar
    }
}
