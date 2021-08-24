
package chain_of_atividade;


public class Chain_of_Atividade {

    
    public static void main(String[] args) {
            Verificador_De_Login ver = new LoginCadastro();
        ver.setNext(new Especial_Caracter());
        ver.setNext(new CaractereMinusculo());
        ver.setNext(new Maisculo_Caractere());

        try {
            ver.efetuarlogin(TiposCaractere.Especial_Caracter);
            ver.efetuarlogin(TiposCaractere.CaractereMinusculo);
            ver.efetuarlogin(TiposCaractere.Maisculo_Caractere);
        } catch (Exception e) {

        }
    }
    
}
