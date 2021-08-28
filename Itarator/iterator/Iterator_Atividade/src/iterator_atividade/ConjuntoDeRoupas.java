
package iterator_atividade;

import java.util.ArrayList;


public abstract class ConjuntoDeRoupas {
       protected ArrayList<Roupas> estoque;

    public ConjuntoDeRoupas() {
        estoque = new ArrayList<Roupas>();
    }

    public int count() {
        return estoque.size();
    }

    public IteratorRoupas criarIterator() {
        return new IteratorRoupas(estoque);
    }
}
