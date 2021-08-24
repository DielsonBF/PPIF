
package chain_of_atividade;


public class Carc_Qtd_Max extends Verificador_De_Login{
        public String senhamin = "Tail49teste";
    public String senhamai = "taiL15@824teste20";
    
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
    
     public Carc_Qtd_Max(){
        super(TiposCaractere.Carc_Qtd_Max);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"diel49teste".equals(this.senhamin)){
            System.out.println("Senha não possui mais de 16 caracteres, senha Cadastrada ");
            
        }else if(!"diel15@824teste22".equals(this.senhamai)){
            System.out.println("Senha com mais de 16 caracteres, Cadastre uma senha com até 16");
        }
        
    }
}
