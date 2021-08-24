
package decorator_atividade;


public class Pacote3 extends Contratação{
       public Pacote3(Assinatura assina) {
        super(assina);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Tipo de pacote 3, aqui você tem"
   + " Caixa surpresa com produtos relacionados a filmes e séries por 29,99R$");

    }
}
