
package composite_atividade;


public class Tipo_Assinatura_Bronze implements Quadrinhos{
        @Override
    public void print(){
        System.out.println("Assinatura Bronze");
        System.out.println("Itens que acompanham a assinatura");
        System.out.println("Adesivo R$ 1,00");
        System.out.println("Chaveiro R$ 5,00");
        System.out.println("Chaveiro R$ 5,00");
        System.out.println("Soma dos itens: 11,00 R$");
    }
}
