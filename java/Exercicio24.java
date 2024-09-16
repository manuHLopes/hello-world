package lista2;

import java.util.Scanner;

public class Exercicio24 {
    static int opcao;
    static boolean valido = true;
    static int num1, num2;

    static void lerMenu(){
        do {
            System.out.println("1 = Se A e B são múltiplos um do outro\n2 = Se A e B são pares\n3 = Se a média de A e B é maior que 7\n4 = Sair");
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
        num1 = ler.nextInt();
        num2 = ler.nextInt();
    }

    static void processar(){
        switch (opcao) {
            case 1:
                if (num1 % num2 == 0 || num2 % num1 == 0) {
                    System.out.println("Eles são múltiplos um do outro!\n");
                } else System.out.println("Eles não são múltiplos um do outro.\n");
                break;
            case 2:
                if (num1 % 2 == 0 && num2 % 2 == 0) {
                    System.out.println("Ambos são pares!\n");
                } else System.out.println("Ambos não são pares.\n");
                break;
            case 3:
                if (((num1 + num2) / 2) >= 7) {
                    System.out.println("A média é maior que sete!\n");
                } else System.out.println("A média não é maior que sete.\n");
                break;
        }
    }

    public static void main(String[] args){
        do {
            lerMenu();
            if(opcao==4) return;
            lerDados();
            processar();
        }while(opcao!=4);
    }
}
