

package pkgabstract.factory;


public class RelogioSamsung implements FabricadeRelogioDigital {
@Override
    public RelogioDigital criarRelogioDigital(){
      return new Samsung46mm();  
    }
    @Override
    public  Sistema criarSistema(){
        return new Aprimoramento2();
    }

}
