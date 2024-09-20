package lista3;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args){
        int num;
        boolean par, positivo;
        char encerrar;
        Scanner ler = new Scanner(System.in);
        do {
           System.out.println("Insira um numero inteiro:");
           num = ler.nextInt();
           par = false;
           positivo = false;
           if(num>0) positivo = true;
           if(num%2==0) par = true;
           System.out.println("O numero é " + ( positivo ? "positivo" : "negativo") + " e " + (par ? "par": "impar"));
           System.out.println("Deseja encerrar o programa? (S/N) MAIÚSCULO:");
           encerrar = ler.next().charAt(0);
        }while (encerrar!='S');

    }
}
