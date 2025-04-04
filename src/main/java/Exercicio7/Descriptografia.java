package Exercicio7;
import java.util.Scanner;
public class Descriptografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de k: ");
        int k = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite a mensagem criptografada: ");
        String msg = sc.nextLine();
        
        String msgDescript = "";
        for (int i = 0; i < 10; i++) {
            char c = msg.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                char novoChar = (char)('A' + (c - 'A'-k+26)%26);
                msgDescript += novoChar;
            }else{
                msgDescript += c;
            }
        }
        
        System.out.println("Mensagem descriptografada: "+ msgDescript);
        sc.close();
    }
}
