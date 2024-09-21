package lista4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String frase;
        Scanner ler = new Scanner(System.in);
        System.out.print("insira uma frase: ");
        frase = ler.nextLine();
        String[] array = frase.split(" ");
        for (String s : array) {
            if(!s.isEmpty()) {
                System.out.print(s);
                if(!s.equals(array[array.length-1])){
                    System.out.print(" ");
                }
            }
        }

    }
}
