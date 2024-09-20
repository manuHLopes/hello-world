package lista3;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args){
        double indice;
        char encerrar;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("insira o indice de poluição: ");
            indice = ler.nextDouble();
            if (indice < 0.05) {
                System.out.println("Insira um valor válido.");
            } else if (indice <= 0.25) {
                System.out.println("Indice de poluição aceitável.");
            } else if (indice < 0.4) {
                System.out.println("Industrias do primeiro grupo estão intimadas a suspender atividades.");
            } else if (indice < 0.5) {
                System.out.println("Industrias do primeiro e segundo grupos estão intimadas a suspender atividades.");
            } else if (indice >= 0.5) {
                System.out.println("Industrias de todos os grupos estão intimadas a suspender atividades.");
            }
            System.out.println("deseja encerrar o programa? (S/N):");
            encerrar = ler.next().charAt(0);
        }while(encerrar != 'S' && encerrar!='s');
    }
}
