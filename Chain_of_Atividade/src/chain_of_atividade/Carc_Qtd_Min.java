
package chain_of_atividade;


public class Carc_Qtd_Min extends Verificador_De_Login{
        public String senhamin = "Cami4";
    public String senhamai = "camI@123";
    
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
    
     public Carc_Qtd_Min(){
        super(TiposCaractere.Carc_Qtd_Min);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel4".equals(this.senhamin)){
            System.out.println("Senha não possui 8 caracteres, Cadastre uma senha com no minimo 8 caracteres");
            
        }else if(!"diel15@8".equals(this.senhamai)){
            System.out.println("Senha com 8 caracteres, Senha Cadastrada");
        }
        
    }
}
