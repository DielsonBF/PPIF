
package iterator_atividade;


public class Iterator_Atividade {

    
    public static void main(String[] args) {
        
           EstoqueRoupas nomes = new EstoqueRoupas();
		System.out.println("Iterando com laço de repetição:");
		for (IteratorRoupas it = nomes.criarIterator(); !it.isDone(); it
				.proximaroupa()) {
			System.out.println(it.getroupa());
		}

		System.out.println("\nIterando de forma manual:");
		IteratorRoupas it = nomes.criarIterator();
		System.out.println(it.getroupa());
		it.proximaroupa();
		System.out.println(it.getroupa());
		it.proximaroupa();
		System.out.println(it.getroupa());
		it.proximaroupa();
		System.out.println(it.getroupa());
		it.proximaroupa();
		System.out.println(it.getroupa());

		System.out.println("\nIterando fora dos limites:");
		it.proximaroupa();
		System.out.println(it.getroupa());
		it.first();
		it.voltarroupa();
		System.out.println(it.getroupa());
    }
    
}
