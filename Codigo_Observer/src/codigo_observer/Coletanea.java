
package codigo_observer;


public class Coletanea implements Notificador{
     @Override
    public void update(Object obj) {
        System.out.println("novo filme adicionado");
    }
}
