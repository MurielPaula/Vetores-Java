package Exercicio3;
import java.lang.Math;
public class DesvioPadrao {
    public static void main(String[] args) {
        int [] v = {10,1,5,8,9,7,1,5,2,3,10};
        
        // Cálculo da média
        double media = 0;
        for(int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;
        
        // Cálcilo do desvio padrão
        double soma = 0, desvio;
        for(int i = 0; i < v.length; i++) { // Somatório Σ
            soma += Math.pow((v[i]-media), 2);
        }
        
        //desvio = Math.pow((1/(v.length-1))*soma, 1/2);
        desvio = Math.sqrt((1.0/(v.length-1))*soma);
        System.out.println("A média: "+media+"\nDesvio padrão: "+desvio);
    }
}
