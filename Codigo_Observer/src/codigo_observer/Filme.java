
package codigo_observer;

import java.util.ArrayList;
import java.util.List;


public class Filme implements Envio_Notificacao{
     private List observers = new ArrayList();
    private double versao;
    public Filme(double versao) {
       this.versao = versao;

       }

    Filme() {
        this.versao = versao;
       
    }
public void setFilme(double versao) {
    this.versao = versao;
        // Quando a alteração do versao ocorrer, esse é o momento correto para notificar os observers.
        this.notifyObservers();
        
    }
 
       @Override
       public void notifyObservers() {
        // Chama o método de atualização de todos os observers disponíveis.
            for (Object ob : observers) {
            System.out.println("Notificando observers!");
            ob.notify();
            }
       }

    @Override
    public void registerObserver(Envio_Notificacao observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Envio_Notificacao observer) {
        
          observers.remove(observer);
    }
}
