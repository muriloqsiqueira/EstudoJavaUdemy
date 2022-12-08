
//Leia uma velocidade em m/s e apresente-a convertida em km/h. a fórmula de conversão é: K=M*3.6
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Double velocidade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a velocidade em m/s: ");
        velocidade = leitor.nextDouble();
        System.out.println("A velocidade convertida é de: " + (velocidade * 3.6) + " km/h.");
        leitor.close();
    }
}
