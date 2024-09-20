package lista1;
import java.util.Scanner;

public class Exercicio2 {
    double cotacao, dolar, real;

    void converter(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite a cotação atual do dolar: ");
        cotacao = ler.nextDouble();
        System.out.println("digite a quantidade maxima: ");
        dolar = ler.nextDouble();
        real = dolar*cotacao;
        System.out.printf("você tem R$ %.2f reais!\n", real);
    }

    public static void main(String[] args) {
        Exercicio2 ex = new Exercicio2();
        ex.converter();
    }
}
