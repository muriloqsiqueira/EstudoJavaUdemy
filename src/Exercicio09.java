
/*
Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação for maior que 20% do valor do salário imprima: Empréstimo não concedido., caso contrário imprima: Empréstimo concedido.
*/
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Double salario, parcela;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor do salário: ");
        salario = leitor.nextDouble();
        System.out.println("Informe o valor das prestações:");
        parcela = leitor.nextDouble();
        if (parcela > ((salario / 100) * 20)) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }
        leitor.close();
    }

}
