
package ativ_adapter;


public class Ativ_Adapter {

 
    public static void main(String[] args) {
        System.out.println("Conectado Ao SGBD Paradox");
        Conectar_Paradox C = new
                Conectar_Paradox();
        
       SGBD_Conexão Nova_conexao = new
                SGBD_Conexão(C);
       Nova_conexao.ConectarParadox();
        
}    
}
