package lista3;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] Args) {
        int valor, maior = 0, menor = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Insira um numero inteiro:");
            valor = ler.nextInt();
            if(valor==0) return;
            if(valor>maior) maior = valor;
            if(menor==0 || valor<menor) menor = valor;
            System.out.println("o maior numero é " + maior);
            System.out.println("o menor numero é " + menor);
        } while (true);
    }
}
