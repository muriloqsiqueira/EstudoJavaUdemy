
//Peça ao usuário para digitar 3 valores inteiros e os imprima
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = leitor.nextInt();

        System.out.println("Os números digitados são: " + num1 + " " + num2 + " " + num3);

        leitor.close();
    }

}
