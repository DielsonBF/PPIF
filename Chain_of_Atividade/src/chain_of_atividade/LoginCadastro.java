
package chain_of_atividade;


public class LoginCadastro extends Verificador_De_Login{
        public String Cliente = "Dielson";
    
    public String getCliente(){
        return Cliente;
    }
    
    public void setCliente(String Cliente){
        this.Cliente = Cliente;
    }
    
    public LoginCadastro(){
        super(TiposCaractere.LoginCadastro);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"Dielson".equals(this.Cliente)){
            System.out.println("Usuario já cadastrado");
        }
        System.out.println("Cliente Cadastrado!!!");
    }
}
