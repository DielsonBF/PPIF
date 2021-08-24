
package decorator_atividade;


public class Decorator_Atividade {

    
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Assinaturas contratadas pelo usuario");
       
       Assinatura tipoassina1 = new Pacote4(new Basica_Assinatura());
       tipoassina1.assinar();
    }
    
}
