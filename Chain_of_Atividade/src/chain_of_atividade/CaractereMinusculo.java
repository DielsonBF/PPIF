
package chain_of_atividade;


public class CaractereMinusculo extends Verificador_De_Login{
     public String senhamin = "diel";
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
    
     public CaractereMinusculo(){
        super(TiposCaractere.CaractereMinusculo);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel".equals(this.senhamin)){
            System.out.println("Senha com caractere Minusculo, Senha Cadastrado");
            
        }else if(!"TAIL".equals(this.senhamai)){
            System.out.println("Não é permitido Senha somente com caractere Maisculo");
        }
        
    }
}
