package lista2;

import java.sql.Struct;
import java.util.Scanner;

public class Exercicio19 {
    static int A, B, C;
    static void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira os 3 lados do triângulo:");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
    }
    static boolean triangulo(){
        return (A<B+C && B<A+C && C<A+B);
    }
    static boolean equilatero(){
        return (A==B && B==C);
    }
    static boolean isosceles(){
        return (A==B || B==C || C==A);
    }
    public static void main(String[] args){
        lerDados();
        if(triangulo()){
            System.out.print("É um triângulo ");
            if(equilatero()){
                System.out.println("equilátero!");
            } else if(isosceles()){
                System.out.println("isosceles!");
            } else System.out.println("escaleno!");
        } else System.out.print("Não é um triângulo.");
    }
}
