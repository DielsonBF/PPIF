
package pkgabstract.factory;


public class RelogioApple implements FabricadeRelogioDigital{
@Override
    public RelogioDigital criarRelogioDigital(){
      return new Apple44mm();  
    }
    @Override
    public  Sistema criarSistema(){
        return new Aprimoramento();
    }

   


}
