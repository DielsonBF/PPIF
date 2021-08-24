
package proxy_atividade;


public class Login implements Tela_De_Login{
         private String nameusu;

    public Login(String nameusu) {
        this.nameusu = nameusu;
        loadFromDisk(nameusu);
        
    }

    @Override
    public void Login_Tela() {
        System.out.println("Usuario " + nameusu);
    }

    private void loadFromDisk(String nameusu) {
        System.out.println("carregando usuario " + nameusu);
    }
}
