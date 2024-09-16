package lista2;
import java.util.*;


public class Exercicio14 {
    static double a, b;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira 2 numeros [pressionando enter ao fim de cada número]:");
        a = ler.nextDouble();
        b = ler.nextDouble();
    }
    static void diferenca(){
        System.out.println("a diferença entre ambos é: " + ((a>b)?(a-b):(b-a)));
    }
    public static void main(String[] args){
        lerDados();
        diferenca();
    }
}
