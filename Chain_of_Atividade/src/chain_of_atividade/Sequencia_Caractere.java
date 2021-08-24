
package chain_of_atividade;


public class Sequencia_Caractere extends Verificador_De_Login{
      public String senhamin = "Cami4";
    public String senhamai = "cami123";
    
    public String getsenhamin(){
        return senhamin;
    }
    
    public String getsenhamai(){
        return senhamai;
    }
    public void setsenhamin(String senhamin){
        this.senhamin = senhamin;
    }
    public void setsenhamai(String senhamai){
        this.senhamai = senhamai;
    }
    
     public Sequencia_Caractere(){
        super(TiposCaractere.Sequencia_Caractere);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel4".equals(this.senhamin)){
            System.out.println("Senha não possui sequencia, Senha Cadastrada");
            
        }else if(!"diel567".equals(this.senhamai)){
            System.out.println("Não é permitido Senha com ordem sequencial");
        }
        
    }
}
