
package iterator_atividade;

import java.util.ArrayList;


public class IteratorRoupas {
       ArrayList<Roupas> lista;
    int contador;

    protected IteratorRoupas(ArrayList<Roupas> lista) {
        this.lista = lista;
        contador = 0;
    }

    public void first() {
        contador = 0;
    }

    public void proximaroupa() {
        contador++;
    }

    public void voltarroupa() {
        contador--;
    }

    public boolean isDone() {
        return contador == lista.size();
    }

    private Roupas currentroupas() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }

    public String getroupa() {
        return currentroupas().estoque;
    }
}
