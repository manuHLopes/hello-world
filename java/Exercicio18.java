package lista2;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Exercicio18 {
    static int CODIGO;
    static String valor = "Código Inválido.";
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira 1 numero inteiro:");
        CODIGO = ler.nextInt();
    }
    public static void main(String[] args){
        lerDados();
        switch (CODIGO){
            case 1:
                valor = "Um.";
                break;
            case 2:
                valor = "Dois.";
                break;
            case 3:
                valor = "Três.";
                break;
        }
        System.out.println(valor);
    }
}
