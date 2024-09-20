package lista1;
import java.util.Scanner;

public class Exercicio1 {
    int qtd_min, qtd_max, qtd_med;

    void calcularMedia(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite a quantidade minima: ");
        qtd_min = ler.nextInt();
        System.out.println("digite a quantidade maxima: ");
        qtd_max = ler.nextInt();
        qtd_med = (qtd_min + qtd_max)/2;
        System.out.println("o estoque medio é: " + qtd_med);
    }

    public static void main(String[] args) {
        Exercicio1 ex1 = new Exercicio1();
        ex1.calcularMedia();
    }
}