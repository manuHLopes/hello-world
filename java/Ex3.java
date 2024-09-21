package lista4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um nome completo: ");
        nome = ler.nextLine();
        String[] array = nome.split(" ");
        for(int i=0; i< array.length;i++){
            switch (array[i].toUpperCase()){
                case "E": case "DO": case "DA": case "DOS": case "DAS":
                case "DE": case "DI": case "DU":
                    break;
                default: System.out.print(array[i].toUpperCase().charAt(0));
            }
        }
    }
}
