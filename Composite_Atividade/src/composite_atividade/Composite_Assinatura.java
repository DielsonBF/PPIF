
package composite_atividade;

import java.util.ArrayList;
import java.util.List;

public class Composite_Assinatura implements Quadrinhos{
         private List<Quadrinhos> childAssinaturas = new ArrayList<Quadrinhos>();


    @Override
    public void print() {
        for (Quadrinhos assinatura : childAssinaturas) {
            assinatura.print();
        }
   
}
      
    public void add(Quadrinhos assinaturas){
        childAssinaturas.add(assinaturas);
    }


    public void remove(Quadrinhos assinaturas){
        childAssinaturas.remove(assinaturas);
    }
}
