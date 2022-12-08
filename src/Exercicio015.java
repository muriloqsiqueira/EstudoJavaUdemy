
/*
Leia um valor em radiano e apresente-o convertido em graus. A fórmula é: G = R * 180 / π
*/
import java.util.*;

public class Exercicio015 {
    public static void main(String[] args) {
        Double angulo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o ângulo em radianos: ");
        angulo = leitor.nextDouble();
        System.out.println("O ângulo convertido em graus é de: " + (angulo * 180 / 3.14));
        leitor.close();
    }

}
