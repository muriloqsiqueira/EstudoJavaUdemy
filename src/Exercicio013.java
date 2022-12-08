
//Leia uma distancia em quilometros e apresente-a convertida em milhas. A fórmula de conversão é: M = K / 1.61 
import java.util.*;

public class Exercicio013 {
    public static void main(String[] args) {
        Double distancia;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a distancia em quilometros: ");
        distancia = leitor.nextDouble();
        System.out.println("A distancia convertida em milhas é de: " + (distancia / 1.61));
        leitor.close();
    }

}
