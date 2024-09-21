package lista4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int num;
        String numString;

        Scanner ler = new Scanner(System.in);
        System.out.println("insira um numero: ");
        num = ler.nextInt();
        numString = String.valueOf(num);
        System.out.print("Resultado: ");
        for(int i=0; i < numString.length() ; i++){
            switch (numString.charAt(i)){
                case '1':
                    System.out.print("um");
                    break;
                case '2':
                    System.out.print("dois");
                    break;
                case '3':
                    System.out.print("três");
                    break;
                case '4':
                    System.out.print("quatro");
                    break;
                case '5':
                    System.out.print("cinco");
                    break;
                case '6':
                    System.out.print("seis");
                    break;
                case '7':
                    System.out.print("sete");
                    break;
                case '8':
                    System.out.print("oito");
                    break;
                case '9':
                    System.out.print("nove");
                    break;
                case '0':
                    System.out.print("zero");
                    break;
            }
            if(i != numString.length()-1) System.out.print(", ");
        }

    }
}
