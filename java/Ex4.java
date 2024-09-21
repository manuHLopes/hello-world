package lista4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        String frase;
        Scanner ler = new Scanner(System.in);
        System.out.print("insira uma frase: ");
        frase = ler.nextLine();
        String[] array = frase.split(" ");
        System.out.println("o numero de caractares é " + frase.length() + " e o numero de palavras é "+ array.length);
    }
}
