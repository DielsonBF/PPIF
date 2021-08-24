
package composite_atividade;


public class Composite_Atividade {

    public static void main(String[] args) {
          Tipo_Assinatura_Ouro assinaouro = new Tipo_Assinatura_Ouro();
      Tipo_Assinatura_Bronze assbronze = new Tipo_Assinatura_Bronze();
      Tipo_Assinatura_Platina assplatina = new Tipo_Assinatura_Platina();
      Tipo_Assinatura_Prata assoprata = new Tipo_Assinatura_Prata();
      
      Composite_Assinatura ouro = new Composite_Assinatura();
      Composite_Assinatura bronze = new Composite_Assinatura();
      Composite_Assinatura platina = new Composite_Assinatura();
      Composite_Assinatura prata = new Composite_Assinatura();
      
      ouro.add(assinaouro);
      bronze.add(assbronze);
      platina.add(assplatina);
      prata.add(assoprata);
      
      ouro.print();
      bronze.print();
      platina.print();
      prata.print();
      
      
      
      
    }
    
}
