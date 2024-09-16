package lista2;
import java.util.*;


public class Exercicio11 {
    //tipo String porque ele pode pegar qualquer valor
    static String a, b, aux;

    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira o A:");
        a = ler.nextLine();
        System.out.println("insira o B:");
        b = ler.nextLine();
    }

    static void troca(){
        aux=a;
        a=b;
        b=aux;
        System.out.println("Após a troca\nA: " + a +" e B: " + b);
    }


    public static void main(String[] args){
        lerDados();
        troca();
    }
}
