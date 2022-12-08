
/*
Faça um programa que leia duas notas de um aluno, verifique se as notas são válidas e exiba na tela a média das notas. Uma nota válida deve ser um valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser informado ao ususário e o programa deve terminar. 
*/
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Double nota1, nota2, media = 0.0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            media = (nota1 + nota2) / 2;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Erro de entrada!");
        }
        leitor.close();
    }
}
