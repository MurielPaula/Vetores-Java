package Exercicio7;
import java.util.Scanner;
public class Criptografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite valor de k: ");
        int k = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite uma palavra: ");
        String msg = sc.nextLine();
        
        String msgCript = "";
        for(int i = 0; i < msg.length(); i++) {
           char c = msg.charAt(i);
           if(c >= 'A' && c<='Z'){
               char novoChar = (char)('A' + (c - 'A'+k)%26);
               msgCript += novoChar;
           } else{
               msgCript += c;
           }
        }
        
        System.out.println("Sua mensagem criptografada: "+msgCript);
        sc.close();
    }
}
