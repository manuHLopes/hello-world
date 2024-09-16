package lista2;
import java.util.*;

public class Exercicio13 {
    static int a, b, c;
    static int maior, menor, meio;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira 3 numeros inteiros [apertando enter ao fim de cada numero]:");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
    }
    static void ordenar(int a, int b, int c){
        if(a>=b && a>=c){
            maior = a;
            if(b>=c){
                meio = b;
                menor = c;
            }
            else {
                meio = c;
                menor = b;
            }
        }else if(b>=a && b>=c){
            maior = b;
            if(a>=c){
                meio = a;
                menor = c;
            }
            else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if(a>=b){
                meio = a;
                menor = b;
            }
            else {
                meio = b;
                menor = a;
            }
        }
    }
    public static void main(String[] args){
        lerDados();
        ordenar(a, b, c);
        System.out.println(maior + " " + meio + " " + menor);
    }
}
