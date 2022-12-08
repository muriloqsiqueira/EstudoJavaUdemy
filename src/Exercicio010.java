
/*
Faça um programa que receba a altura e o sexo de uma pessoa, calcule e mostre seu peso ideal. Utilize a seguinte fórmula:
Homens (72.7 * alt) - 58
Mulheres (62.1 * alt) - 44.7
*/
import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Double altura, pesoIdeal;
        char sexo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a altura: ");
        altura = leitor.nextDouble();
        System.out.println("Informe o sexo (H - Homem | M - Mulher): ");
        sexo = leitor.next().charAt(0);

        if (sexo == 'H') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal + "Kg.");
        } else if (sexo == 'M') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal + "Kg.");
        } else {
            System.out.println("Erro de entrada.");
        }
        leitor.close();
    }

}
