
package chain_of_atividade;


public class Especial_Caracter extends Verificador_De_Login{
      public String senhacesp = "diel@";
    public String senhasemesp = "Diel";
    
    public String getsenhasemesp(){
        return senhasemesp;
    }
    
    public String getsenhacesp(){
        return senhacesp;
    }
    public void setsenhasemesp(String senhasemesp){
        this.senhasemesp = senhasemesp;
    }
    public void setsenhacesp(String senhacesp){
        this.senhacesp = senhacesp;
    }
    
     public Especial_Caracter(){
        super(TiposCaractere.Especial_Caracter);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel".equals(this.senhasemesp)){
            System.out.println("Não é permitido Senha sem caractere especial");
            
        }else if(!"Diel@".equals(this.senhacesp)){
            System.out.println("Senha com caractere especial, senha Cadastrada");
        }
        
    }
}
