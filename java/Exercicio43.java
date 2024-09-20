package lista3;

public class Exercicio43 {
    public static void main(String[] args){
        double graos=1;
        for(int i = 0; i<8; i++){
            for(int j=0; j<8; j++){
                graos = graos * 2;
            }
        }
        System.out.println("o total de grãos que ele esperava receber era, em notação científica: " + graos);
    }
}
