
package decorator_atividade;


public class Pacote2 extends Contratação{
         public Pacote2(Assinatura assina) {
        super(assina);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Tipo de pacote 2, aqui você tem"
                + " frete gratis em produtos por 9,99R$");
     
    }
}
