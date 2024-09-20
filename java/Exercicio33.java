package lista3;

import java.util.Scanner;

public class Exercicio33 {
    String matricula;
    double nota;


    public static void main(String[] args){
        int qtd=0;
        double media=0;
        char continuar;
        Exercicio33 aluno = new Exercicio33();
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("insira a matricula do aluno:");
            aluno.matricula = ler.next();
            System.out.println("insira a nota do aluno");
            aluno.nota = ler.nextDouble();
            media+= aluno.nota;
            qtd++;
            System.out.println("Mais algum aluno? (S/N):");
            continuar = ler.next().charAt(0);
        }while(continuar == 'S' || continuar=='s');
        media = media/qtd;
        System.out.println("A média das notas dessa prova é: " + media);
    }

}
