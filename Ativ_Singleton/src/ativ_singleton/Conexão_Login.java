
package ativ_singleton;


public class Conexão_Login {
     private static Conexão_Login login = null;
    private String Usuario;
    private String Senha;
    private Conexão_Login(){}
    static Conexão_Login getlogin(){
        if(login == null){
            login = new Conexão_Login();
        }
         return login;
    }
    public String getUsuario(){
        return Usuario;
    }
     public void setUsuario(String Usuario){
        this.Usuario = Usuario;
         
}
      public String getSenha(){
        return Senha;
    }
     public void setSenha(String Senha){
        this.Senha = Senha;
        
}
    
}
