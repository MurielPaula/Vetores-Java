package Exercicio1;
public class PreencherVetor {
    public static void main(String[] args) {
        int [] numeros = new int [50]; 
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 5 * i)%(i+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
