
package proxy_atividade;


public class Proxy_Atividade {

    
    public static void main(String[] args) {

        Tela_De_Login tela = new Login_Proxy("conectado");
        tela.Login_Tela();
        System.out.println("");

        tela.Login_Tela();
    }
}
