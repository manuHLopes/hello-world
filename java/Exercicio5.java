package lista1;
import java.util.Scanner;

public class Exercicio5 {
    double velMed, tempo, distancia, litros;
    void recebeDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem: ");
        tempo = ler.nextDouble();
        System.out.println("Digite a velocidade média: ");
        velMed = ler.nextDouble();
    }
    void calcular(){
        distancia = velMed*tempo;
        litros = distancia/12;
    }
    void imprime(){
        System.out.printf(" velocidade média: %.2f km/h\n tempo gasto: %.2fh\n distância percorrida: %.2f km\n quantidade de litros utilizada na viagem: %.2f L\n", velMed, tempo, distancia, litros);
    }
    public static void main(String[] args) {
        Exercicio5 ex = new Exercicio5();
        ex.recebeDados();
        ex.calcular();
        ex.imprime();
    }
}
