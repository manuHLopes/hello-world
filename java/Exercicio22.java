package lista2;

import java.util.Scanner;

public class Exercicio22 {
    static int num, a, b;
    static void lerDados(){
        System.out.println("insira um numero: ");
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
    }
    static void armazenar(){
        if(num>=0) {
            a = num;
        } else b = num;
    }
    public static void main(String[] args){
        lerDados();
        armazenar();
        System.out.println("o número foi armazenado em " + ( (num>=0) ? ("A: " + a) : ("B: " + b) ));
    }
}
