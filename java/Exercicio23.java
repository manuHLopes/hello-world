package lista2;

import java.util.Scanner;

public class Exercicio23 {
    static int opcao;
    static boolean valido = true;
    static double num1, num2;

    static void lerMenu(){
        do {
            System.out.println("1 = Adição\n2 = Subtração\n3 = Multiplicação\n4 = Divisão");
            System.out.println("escolha uma opção: ");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();
            if (opcao < 1 || opcao > 4) {
                System.out.println("Você precisa inserir um número de 1 a 4, bobinho!!");
                valido = false;
            } else valido = true;
        }while (!valido);
    }
    static void lerDados(){
        System.out.println("insira 2 numeros:");
        Scanner ler = new Scanner(System.in);
        num1 = ler.nextDouble();
        num2 = ler.nextDouble();
    }

    public static void main(String[] args){
        lerMenu();
        lerDados();
        switch (opcao){
            case 1:
                System.out.println("Você selecionou ADIÇÃO:");
                System.out.println("A + B = "+ (num1+num2));
                break;
            case 2:
                System.out.println("Você selecionou SUBTRAÇÃO:");
                System.out.println("A - B = "+ (num1-num2));
                break;
            case 3:
                System.out.println("Você selecionou MULTIPLICAÇÃO:");
                System.out.println("A * B = "+ (num1*num2));
                break;
            case 4:
                System.out.println("Você selecionou DIVISÃO:");
                if(num2!=0) System.out.println("A / B = "+ (num1/num2));
                else System.out.println("Infelizmente não é possível dividir por zero :(");
                break;
        }
    } 
}
