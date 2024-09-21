package lista4;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

    static String[] recombinacao(String s1, String s2, String s3, String s4){
        Random gerador = new Random();
        int indice = gerador.nextInt(s1.length());
        s3 = s1.substring(0, indice) + s2.substring(indice);
        s4 = s2.substring(0, indice) + s1.substring(indice);
        return new String[]{s3, s4};
    }

    static String mutacao(String s1){
        Random gerador = new Random();
        StringBuilder aux = new StringBuilder();
        int indice = gerador.nextInt(s1.length());
        for(int i = 0; i < s1.length(); i++){
            if(i==indice){
                aux.append(s1.charAt(gerador.nextInt(s1.length())));
            } else aux.append(s1.charAt(i));
        }
        return aux.toString();
    }


    public static void main(String[] args){
        String s1, s2, s3 = "", s4 = "";
        String[] aux;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira duas strings de mesmo tamanho:");
        s1 = ler.nextLine();
        s2 = ler.nextLine();
        if(s1.length() != s2.length()) {
            System.out.println("as strings precisam ter o mesmo tamanho!");
            return;
        }
        aux = recombinacao(s1, s2, s3, s4);
        s3 = aux[0];
        s4 = aux[1];
        s4 = mutacao(s4);

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
        System.out.println("S3: " + s3);
        System.out.println("S4: " + s4);
    }
}
