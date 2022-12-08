
//Leia uma distancia em milhas e apresente-a convertida em quilometros. A fórmula de conversão é: K = 1.61 * M
import java.util.*;

public class Exercicio012 {
    public static void main(String[] args) {
        Double distancia;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a distancia em milhas: ");
        distancia = leitor.nextDouble();
        System.out.println("A distancia convertida em quilometros é de: " + (distancia * 1.61));
        leitor.close();
    }

}
