//Faça um programa que leia um número inteiro e o imprima

import java.util.Scanner;

class Exercicio01 {
    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        num = leitor.nextInt();

        System.out.println("O número informado é: " + num);

        leitor.close();

    }
}