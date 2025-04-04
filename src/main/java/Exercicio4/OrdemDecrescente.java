package Exercicio4;
import java.util.Scanner;
public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números quer armazenar?");
        int n = sc.nextInt();
        double [] v = new double[n];
        
        System.out.println("Digite a sequência de "+n+": ");
        for(int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
        
        // Ordenar
        for(int i = 0; i < v.length-1; i++) { // Percorre até o penúltimo número
            for(int j = i+1; j < v.length; j++) { // percorre até o último
                if(v[i]<v[j]){ // verfica se i é maior que j 
                    double aux = v[i];
                    v[i] = v[j]; // joga o maior, para o primeiro indice
                    v[j] = aux;// joga o atual menor ao lado, até completar o loop
                }
            }
        }
        
        System.out.println("Ordem Decrescente:");
        for(int i = 0; i < v.length; i++) {
             System.out.print(v[i]+" ");
        }        
        sc.close();
    }
}
