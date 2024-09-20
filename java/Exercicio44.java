package lista3;


import lista1.Exercicio6;
import lista1.Exercicio7;
import lista2.Exercicio25;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        char encerrar;
        double peso, ideal;
        do{
            System.out.print("1 – Conversão de Graus Celsius em Graus Fahrenheit\n" +
                    "2 – Conversão de Graus Fahrenheit em Graus Celsius\n" +
                    "3 – Peso ideal do homem\n"+
                    "4 – Peso ideal da mulher\n");
            System.out.println("escolha uma opção:");
            opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    Exercicio6.main(new String[0]);
                    break;
                case 2:
                    Exercicio7.main(new String[0]);
                    break;
                case 3:
                    System.out.println("qual o seu peso (em kg)?");
                    peso = ler.nextDouble();
                    ideal = Exercicio25.calcular('M');
                    if(peso!=ideal) System.out.println(" Você está " + ((peso>ideal)?"acima":"abaixo") + " do peso ideal.");
                    break;
                case 4:
                    System.out.println("qual o seu peso?");
                    peso = ler.nextDouble();
                    ideal = Exercicio25.calcular('F');
                    if(peso!=ideal) System.out.println(" Você está " + ((peso>ideal)?"acima":"abaixo") + " do peso ideal.");
                    break;
                default:
                    System.out.println("opção inválida");
            }
            System.out.println("deseja encerrar o programa?");
            encerrar = ler.next().charAt(0);
        }while(encerrar!='s' && encerrar!='S');
    }
}
