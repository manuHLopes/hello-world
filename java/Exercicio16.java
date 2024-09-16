package lista2;
import java.util.*;

public class Exercicio16 {
    static int a, b;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira 2 numeros [pressionando enter ao fim de cada número]:");
        a = ler.nextInt();
        b = ler.nextInt();
    }
    public static void main(String[] args){
        lerDados();
        if(a==b){
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("O maior numero é: "+ ((a>b)?a:b));
            System.out.println("O menor número é: " + ((a>b)?b:a));
        }
    }
}
