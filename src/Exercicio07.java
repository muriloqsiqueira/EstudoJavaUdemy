
/*
Faça um programa que receba dois números e mostre o maior. Se por acaso os dois números forem iguais, apresente a mensagem: números iguais.
*/
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = leitor.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }

        leitor.close();
    }

}
