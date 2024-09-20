package lista3;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] Args) {
        int num, soma=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um numero inteiro:");
        num = ler.nextInt();
        if(num>0 && num<10){
            for (int i=num; i<num+20; i++){
                soma += (i*i);
            }
            System.out.println("A soma é: " + soma);
        }
    }
}
