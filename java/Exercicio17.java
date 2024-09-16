package lista2;

import java.util.Scanner;

public class Exercicio17 {
    static int a;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira 1 numero inteiro:");
        a = ler.nextInt();
    }
    public static void main(String[] args){
        lerDados();
        if(a>=0 && a<=9){
            System.out.println("Valor Válido.");
        } else System.out.println("Valor Inválido.");
    }
}
