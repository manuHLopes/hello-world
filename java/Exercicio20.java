package lista2;

import java.util.Scanner;

public class Exercicio20 {
    static int a, b, c;
    static boolean valido = false;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("insira 3 valores inteiros maiores que zero:");
            a = ler.nextInt();
            b = ler.nextInt();
            c = ler.nextInt();
            if(a>0 && b>0 && c>0) valido = true;
            else System.out.println("Valor inválido.");
        }while (!valido);
    }
    static void resultado(){
        Exercicio13 valor = new Exercicio13();
        valor.ordenar(a, b, c);
        System.out.println("menor valor multiplicado pelo maior: " + (valor.menor * valor.maior));
        System.out.println("maior valor dividido pelo menor: " + (valor.maior / valor.menor));
    }
    public static void main(String[] args){
        lerDados();
        resultado();
    }


}
