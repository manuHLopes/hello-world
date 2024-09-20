package lista3;

import java.util.Scanner;
public class Exercicio27 {

    public static void main(String[] args){
        int qtd, fatorial, total;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos numeros você quer processar?");
        qtd = ler.nextInt();
        for (int i = 0; i<qtd; i++) {
            System.out.println("Insira o "+ (i+1) + "º termo:");
            fatorial = ler.nextInt();
            total = 1;
            while (fatorial > 1) {
                total *= fatorial;
                fatorial--;
            }
            System.out.println("o fatorial do "+ (i+1) + "º termo é: "+total);
        }

    }
}
