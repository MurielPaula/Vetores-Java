package Exercicio2;
import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número N: ");
        int N = sc.nextInt();
        double [] vetor = new double [N];
        
        // Armazena números no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe uma sequência de números reais: ");
            vetor[i] = sc.nextDouble();
        }
        // Analisa qual maior, menor número e média
        double maior = vetor[0], menor = vetor[0], media = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
            media += vetor[i];
        }
        // Cálcula média
        media /= N;
        
        // Contagem de média
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if(vetor[i]>=media){
                cont++;
            }
        }
        System.out.println("Maior: "+maior+
                            "\nMenor: "+menor+
                            "\nMédia: "+media+
                            "\nQuantidade de elementos iguais ou maiores que a média: "+ cont);
        sc.close();
    }
}
