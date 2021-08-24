
package chain_of_atividade;


public class Numero_Caractere extends Verificador_De_Login{
         public String senhamin = "diel5";
    public String senhamai = "DIEL";
    
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
    
     public Numero_Caractere(){
        super(TiposCaractere.Numero_Caractere);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel5".equals(this.senhamin)){
            System.out.println("Senha com caractere Numero, Senha Cadastrada");
            
        }else if(!"DIEL".equals(this.senhamai)){
            System.out.println("Não é permitido Senha sem caractere numero");
        }
        
    }
}
