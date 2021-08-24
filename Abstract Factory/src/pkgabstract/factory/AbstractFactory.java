package pkgabstract.factory;

public class AbstractFactory {

    public static void main(String[] args) {

         
         FabricadeRelogioDigital fabdit = new RelogioApple();
         RelogioDigital rel1 = fabdit.criarRelogioDigital();
         rel1.exibirInfoResolucao();
         Sistema sist = fabdit.criarSistema();
         sist.exibirInfoSistema();
         
         FabricadeRelogioDigital fabdit2 = new RelogioSamsung();
         RelogioDigital rel2 = fabdit2.criarRelogioDigital();
         rel2.exibirInfoResolucao();
         Sistema sist2 = fabdit2.criarSistema();
         sist2.exibirInfoSistema();
         
    }

}
