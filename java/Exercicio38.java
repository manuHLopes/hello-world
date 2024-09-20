package lista3;

import java.util.Scanner;

public class Exercicio38 {
    static String C;
    static int N;
    static double salario, E = 0;

    static void calculaSalario(){
        if(N>50){
            E=(N-50)*20;
            salario = 50*10 + E;
        } else salario = N*10;
    }

    public static void main(String[] Args){
        char encerrar;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("insira o codigo do funcionário: ");
            C = ler.next();
            System.out.println("insira as horas trabalhadas: ");
            N = ler.nextInt();
            calculaSalario();
            System.out.println("Funcionário de Cod: " + C);
            System.out.println("Salário total: " + salario);
            System.out.println("Salário excedente: " + E);
            System.out.println("deseja encerrar? (S/N):");
            encerrar = ler.next().charAt(0);
        }while(encerrar!='S');



    }
}
