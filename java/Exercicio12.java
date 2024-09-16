package lista2;
import java.util.*;

public class Exercicio12 {
    static int numero;

    static void lerNumero(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira um numero inteiro:");
        numero = ler.nextInt();
    }

    static void modulo(){
        if(numero<0){
            numero = numero * (-1);
        }
        System.out.println("O módulo é: " + numero);
    }

    public static void main(String[] args){
        lerNumero();
        modulo();
    }
}
