package lista1;
import java.util.Scanner;

public class Exercicio9 {
    int a, m, d, total;
    void recebeDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os anos: ");
        a = ler.nextInt();
        System.out.println("Digite os meses: ");
        m = ler.nextInt();
        System.out.println("Digite os dias: ");
        d = ler.nextInt();
    }
    void calcula(){
        total = (a * 365) + (m * 30) + d;
        System.out.println("você viveu " + total + " dias de vida!");
    }

    public static void main(String[] args) {
        Exercicio9 ex9 = new Exercicio9();
        ex9.recebeDados();
        ex9.calcula();
    }
}
