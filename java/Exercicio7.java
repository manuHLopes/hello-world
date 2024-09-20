package lista1;
import java.util.Scanner;

public class Exercicio7 {
    double celsius, fahre;
    void recebeDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        fahre = ler.nextDouble();
    }
    void converte(){
        celsius = (fahre - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }

    public static void main(String[] args) {
        Exercicio7 ex7 = new Exercicio7();
        ex7.recebeDados();
        ex7.converte();
    }
}
