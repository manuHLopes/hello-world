package lista3;

import java.util.Scanner;

public class Exercicio36 {
    static int valor, maior = 0, menor = -1, qtd=0;
    static double media=0;

    public static void main(String[] Args) {
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Insira um numero inteiro:");
            valor = ler.nextInt();
            if(valor<0) break;
            if(valor>maior) maior = valor;
            if(menor==-1 || valor<menor) menor = valor;
            qtd++;
            media+=valor;
        } while (true);
        System.out.println("o maior numero é " + maior);
        System.out.println("o menor numero é " + menor);
        media = media/qtd;
        System.out.println("a média dos numeros é " + media);
    }
}
