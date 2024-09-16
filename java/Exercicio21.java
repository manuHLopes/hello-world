package lista2;

import java.util.Scanner;

public class Exercicio21 {
    static int a;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
    }

    public static void main(String[] args){
        do{
            System.out.println("insira um numero inteiro para descobrir se é positivo ou negativo!\n[ou insira zero para encerrar a execução]:");
            lerDados();
            if(a==0) return;
            if(a>0) System.out.println("o numero é positivo!\n");
            else System.out.println("o numero é negativo!\n");
        }while(a!=0);
    }
}
