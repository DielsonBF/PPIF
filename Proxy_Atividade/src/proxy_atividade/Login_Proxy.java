
package proxy_atividade;


public class Login_Proxy implements Tela_De_Login{
         private Login loginuse;
        private String nameusu;

    public Login_Proxy(String usuname) {
        this.nameusu = usuname;
    }

    @Override
    public void Login_Tela() {
        if (loginuse == null) {
            loginuse = new Login(nameusu);
        }
        loginuse.Login_Tela();
    }
}
