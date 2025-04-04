package Exercicio6;
import java.util.Scanner;
public class PosicaoAlfabeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next().toUpperCase();
        System.out.println("Palavra: "+palavra);
        System.out.println("Posições no alfabeto: ");
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if(c >='A' && c<= 'Z'){
                int posicao = c - 'A'+1;
                System.out.println("Letra: "+posicao);
            }else{
                System.out.println(c+" Não é uma letra válida!");
            }
        }
        sc.close();
    }
         
}
