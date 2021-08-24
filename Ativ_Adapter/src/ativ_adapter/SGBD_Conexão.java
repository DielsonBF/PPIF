
package ativ_adapter;


public class SGBD_Conexão extends Conectar_Paradox{
      private Conectar_Firebird firebird;
            public SGBD_Conexão(Conectar_Firebird
        firebird) {
        this.firebird = firebird;
 }
    @Override
            public void ConectarParadox(){
                firebird.ConectarFirebird();
            }
        
             private Conectar_MySQL mysql;
            public SGBD_Conexão(Conectar_MySQL
        mysql) {
        this.mysql = mysql;
 }
    
            public void ConectarMySQL(){
                mysql.ConectarMySQL();
            }
            
                   private Conectar_Paradox paradox;
            public SGBD_Conexão(Conectar_Paradox
        paradox) {
        this.paradox = paradox;
        
 }
            
    public void ConectarFirebird(){
                paradox.ConectarParadox();
            }
}
