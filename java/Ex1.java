package lista4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String nome;
        int vogais = 0, digitos = 0;
        boolean pali = true;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        nome = ler.nextLine();


        //a
        System.out.println("a) a string tem tamanho: " + nome.length());

        //b
        System.out.println("b) " + nome.toUpperCase());

        //c
        for(int i=0; i<nome.length(); i++){
            switch (nome.toLowerCase().charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                   vogais++;
                   break;
            }
        }
        System.out.println("c) a string tem " + vogais + " vogais.");

        //d
        if(nome.toUpperCase().startsWith("UNI")){
            System.out.println("d) a string começa com UNI");
        } else System.out.println("d) a string não começa com UNI");

        //e
        if(nome.toUpperCase().endsWith("RIO")){
            System.out.println("e) a string termina com RIO");
        } else System.out.println("e) a string não termina com RIO");

        //f
        for(int i=0; i<nome.length(); i++){
           if(nome.charAt(i) >= '0' && nome.charAt(i) <= '9'){
                digitos++;
            }
        }
        System.out.println("c) a string tem " + digitos + " digitos (0 a 9).");

        //g
        for(int i=0; i<nome.length()/2;i++){
            if(nome.toLowerCase().charAt(i) != nome.toLowerCase().charAt(nome.length()-1-i) && pali){
                pali = false;
                System.out.println("g) a string não é um palíndromo.");
            }
        }
        if(pali) System.out.println("g) a string é um palíndromo.");
    }
}
