//Faça um programa que leia um número real e o imprima

import java.util.Scanner;

class Exercicio02 {
    public static void main(String[] args) {
        Float num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número real: ");
        num = leitor.nextFloat();
        System.out.println("O número é: " + num);

        leitor.close();

    }

}
