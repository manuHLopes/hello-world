package lista3;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        int idade;
        String categoria = "default";
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        if (idade >= 5) {
            if (idade <= 7) {
                categoria = "Infantil A";
            }
            if (idade >= 8 && idade <= 11) {
                categoria = "Infantil B";
            }
            if (idade >= 12 && idade <= 13) {
                categoria = "Juvenil A";
            }
            if (idade >= 14 && idade <= 17) {
                categoria = "Juvenil B";
            }
            if (idade >= 18) {
                categoria = "Adultos";
            }
            System.out.println("Sua categoria de nadador é " + categoria);
        } else System.out.println("Desculpe, só aceitamos alunos acima de 5 anos");
    }
}
