package lista1;
import java.util.Scanner;

public class Exercicio3 {
    String vendedor, cod_peca;
    double preco, comissao;
    int qtd_vendida;

    void recebeDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        vendedor = ler.nextLine();
        System.out.println("Digite o codigo da peça: ");
        cod_peca = ler.nextLine();
        System.out.println("Digite o valor do produto: ");
        preco = ler.nextDouble();
        System.out.println("Quantidade de peças vendidas: ");
        qtd_vendida = ler.nextInt();
    }
    void calculaComissao(){
        comissao = (preco * qtd_vendida) * 0.05;
    }
    void imprimeComissao(){
        System.out.print("O Vendedor "+vendedor);
        System.out.printf(" receberá R$ %.2f de comissão!", comissao);
    }

    public static void main(String[] args){
        Exercicio3 ex3 = new Exercicio3();
        ex3.recebeDados();
        ex3.calculaComissao();
        ex3.imprimeComissao();
    }
}
