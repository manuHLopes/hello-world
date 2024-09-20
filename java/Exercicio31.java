package lista3;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] Args) {
        int valor, impar = 0, par = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Insira um numero positivo:");
            valor = ler.nextInt();
            if(valor>0) {
                if (valor % 2 == 0) {
                    System.out.println("Esse numero é par");
                    par += valor;
                } else {
                    System.out.println("Esse numero é impar");
                    impar += valor;
                }
            }
        } while (valor > 0);
            System.out.println("a soma dos pares: " + par);
            System.out.println("a soma dos impares: " + impar);

    }
}
