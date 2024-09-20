package lista1;
import java.util.Scanner;

public class Exercicio8 {
    double v, r, a;
    void recebeDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        r = ler.nextDouble();
        System.out.println("Digite a altura: ");
        a = ler.nextDouble();
    }
    void calcula(){
        v = 3.14159 * r * r * a;
        System.out.println("Volume: " + v);
    }

    public static void main(String[] args) {
        Exercicio8 ex8 = new Exercicio8();
        ex8.recebeDados();
        ex8.calcula();
    }
}
