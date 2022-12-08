
/*
Leia um ângulo em graus e apresente-o convertido em radiano. A fórmula de conversão é: R = G * π / 180.
*/
import java.util.*;

public class Exercicio014 {
    public static void main(String[] args) {
        Double angulo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o ângulo em graus: ");
        angulo = leitor.nextDouble();
        System.out.println("O ângulo convertido em radiano é de: " + (angulo * 3.14 / 180));
        leitor.close();
    }

}
