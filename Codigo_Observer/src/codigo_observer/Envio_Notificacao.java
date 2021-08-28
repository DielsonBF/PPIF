
package codigo_observer;


public interface Envio_Notificacao {
    public void registerObserver(Envio_Notificacao observer);

    public void removeObserver(Envio_Notificacao observer);

    public void notifyObservers();
}
