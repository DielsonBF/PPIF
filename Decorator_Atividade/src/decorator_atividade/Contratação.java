
package decorator_atividade;


public class Contratação implements Assinatura{
      public Assinatura assina;

    public Contratação(Assinatura assina) {
        this.assina = assina;
    }

    @Override
    public void assinar() {
        this.assina.assinar();
    }
}
