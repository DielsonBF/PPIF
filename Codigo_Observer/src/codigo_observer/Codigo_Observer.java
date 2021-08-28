
package codigo_observer;


public class Codigo_Observer {

   
    public static void main(String[] args) {

        Coletanea colecao = new Coletanea();
      Filme filme = new Filme();
      Filme filme2 = new Filme();
      Filme filme3 = new Filme();
      Filme filme4 = new Filme();
      Filme filme5 = new Filme();
      filme.registerObserver(filme);
      colecao.update(filme);
      filme.registerObserver(filme2);
      colecao.update(filme2);
      filme.registerObserver(filme3);
      colecao.update(filme3);
      filme.registerObserver(filme4);
      colecao.update(filme4);
      filme.registerObserver(filme5);
      colecao.update(filme5);
        System.out.println(filme);
        System.out.println(filme2);
        System.out.println(filme3);
        System.out.println(filme4);
        System.out.println(filme5);
    }
    
}
