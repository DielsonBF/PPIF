
package chain_of_atividade;


public class Maisculo_Caractere extends Verificador_De_Login{
        public String senhamai = "Di";
    public String senhamin = "Ca";
    
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
    
     public Maisculo_Caractere(){
        super(TiposCaractere.Maisculo_Caractere);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"di".equals(this.senhamin)){
            System.out.println("Não é permitido Senha somente com caractere Minusculo");
            
        }else if(!"DI".equals(this.senhamai)){
            System.out.println("Senha com caractere Maisculo, senha Cadastrada");
        }
        
    }
}
