package lista1;
import java.util.Scanner;

public class Exercicio4 {
    int a, b, c, d;
    void recebeDados(){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um valor a: ");
        a=ler.nextInt();
        System.out.println("Digite um valor b: ");
        b=ler.nextInt();
        System.out.println("Digite um valor c: ");
        c=ler.nextInt();
        System.out.println("Digite um valor d: ");
        d=ler.nextInt();
    }
    void operacoes(){
        System.out.println("A+B = " + (a+b));
        System.out.println("A+C = " + (a+c));
        System.out.println("A+D = " + (a+d));
        System.out.println("B+C = " + (b+c));
        System.out.println("B+D = " + (b+d));
        System.out.println("C+D = " + (c+d));
        System.out.println("***");
        System.out.println("A*B = " + (a*b));
        System.out.println("A*C = " + (a*c));
        System.out.println("A*D = " + (a*d));
        System.out.println("B*C = " + (b*c));
        System.out.println("B*D = " + (b*d));
        System.out.println("C*D = " + (c*d));
    }
    public static void main(String[] args) {
        Exercicio4 obj = new Exercicio4();
        obj.recebeDados();
        obj.operacoes();
    }
}
