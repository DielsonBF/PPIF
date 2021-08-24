
package ativ_singleton;

import java.util.Scanner;


public class Ativ_Singleton {

  
    public static void main(String[] args) {
        Conexão_Login teste1 = Conexão_Login.getlogin();
        System.out.println(teste1);
        Scanner conexao1 = new Scanner(System.in);
        System.out.println(teste1);
        System.out.println("Digite seu usuario");
        String login = conexao1.next();
        System.out.println("Usuario " + login);
        
        Scanner conexao2 = new Scanner(System.in);
        System.out.println(teste1);
        System.out.println("Digite sua senha");
        String Senha = conexao2.next();
        System.out.println("Senha " + Senha);
        
        System.out.println("Login feito com Sucesso");
    }
    
}
