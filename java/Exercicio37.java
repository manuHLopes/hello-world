package lista3;

import lista1.Exercicio6;
import lista1.Exercicio7;
import lista2.Exercicio25;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        double a=0, b=0;
        char continuar;
        double peso, ideal;
        do{
            System.out.print(   "1 – Adição\n" +
                                "2 – Subtração\n" +
                                "3 – Multiplicação\n" +
                                "4 – Divisão\n"         );
            System.out.println("Informe a opção:");
            opcao = ler.nextInt();
            if(opcao>0 && opcao<5) {
                System.out.println("insira dois numeros:");
                a = ler.nextDouble();
                b = ler.nextDouble();
            }
            switch (opcao){
                case 1:
                    System.out.println("a soma é: " + (a+b));
                    break;
                case 2:
                    System.out.println("a subtração é: " + (a-b));
                    break;
                case 3:
                    System.out.println("a multiplicação é: " + (a*b));
                    break;
                case 4:
                    if(b!=0) {
                        System.out.println("a divisão é: " + (a / b));
                    }else System.out.println("não se pode dividir por zero");
                    break;
                default:
                    System.out.println("opção inválida, tente novamente");
            }
            System.out.println("deseja voltar ao menu?");
            continuar = ler.next().charAt(0);
        }while(continuar=='s' || continuar=='S');
    }
}
