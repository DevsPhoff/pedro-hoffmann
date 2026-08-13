import java.util.Scanner;
//Métodos com parâmetros
//3)Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
//números que vem após esse número
//(O parâmetro do metodo deve ser o número inserido pelo usuário)

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número do seu parâmetro");
        int parametro = sc.nextInt();

        for (int i = 0; int i <= 20; i++) {
            System.out.println(i + parametro);
        }





    }
}