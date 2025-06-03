import java.util.Scanner;
class jonathan13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano : ");

        int Ano = teclado.nextInt();

        if (Ano < 1930 || Ano > 2025){
            System.out.print("Digite um ano entre 1930 e 2025! ");
        }
        else {
            int CopasRealizadas = ((Ano - 1930)/4);

        if (Ano >= 1942 || Ano <= 1946){
            System.out.print(CopasRealizadas - 1);
        }
        else{
            System.out.printf("Foram realizadas %d copas do mundo",CopasRealizadas );//nao terminei
            }
        }
    }

}
