/*
Leia uma temperatura em graus Célcius e a apresente convertida em Fahrenheit. A formula da conversão é: F=C*(9.0/5.0)+32.0
*/
public class Exercicio06 {
    public static void main(String[] args) {
        Double celcius = 35.00;
        Double fah = celcius * (9.0 / 5.0) + 32.0;
        System.out.println("A temperatura de " + celcius + "º celcius foi convertida para " + fah + "º Fahrenheit.");
    }

}
