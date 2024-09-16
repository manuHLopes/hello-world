package lista2;

import java.util.Scanner;

public class Exercicio25 {
    static double h;
    static char sexo;

    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira sua altura (em metros):");
        h = ler.nextDouble();
        System.out.println("insira seu sexo [F/M]:");
        sexo = ler.next().charAt(0);
    }
    static void calcular(){
        if(sexo=='f' || sexo == 'F'){
            System.out.printf("Seu peso ideal é: %.2f kg.", ((62.1 * h) - 44.7));
        } else if(sexo=='m' || sexo == 'M')
            System.out.printf("Seu peso ideal é: %.2f kg.", ((72.7*h) - 58));
        else System.out.println("Sexo inválido, tente novamente.");
    }

    public static void main(String[] args){
        lerDados();
        calcular();
    }
}
