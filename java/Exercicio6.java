package lista1;
import java.util.Scanner;

public class Exercicio6 {

    public static double converte(double celsius){
        return (9* celsius +160 ) / 5;
    }

    public static void main(String[] args) {
        double celsius, fahre;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = ler.nextDouble();
        fahre = converte(celsius);
        System.out.println("Fahrenheit: " + fahre);
    }
}
