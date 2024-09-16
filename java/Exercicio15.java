package lista2;
import java.util.*;

public class Exercicio15 {
    static double[] notas = new double[4];
    static double recup, media = 0;

    static void lerNotas(){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira as 4 notas do aluno:");
        for(int i = 0; i<4; i++){
           notas[i] = ler.nextDouble();
           media += notas[i];
        }
        media /= 4;
    }
    static boolean passou(){
        return media >= 7;
    }
    static void recuperacao(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Média: "+ media + "\ninsira a nota da recuperação: ");
        recup = ler.nextDouble();
        media = (media + recup)/2;
        if(passou()){
            System.out.println("O aluno foi aprovado na recuperação. Média: "+ media);
        } else System.out.println("O aluno foi reprovado. Média: " + media);
    }

    public static void main(String[] args){
        lerNotas();
        if(!passou()){
            recuperacao();
        } else System.out.println("O aluno foi aprovado por média! Media: " + media);
    }
}
