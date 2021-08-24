
package chain_of_atividade;


public abstract class Verificador_De_Login {
     protected Verificador_De_Login next;
    protected TiposCaractere identificadorCaractere;

    public Verificador_De_Login(TiposCaractere Tip) {
        next = null;
        identificadorCaractere = Tip;
    }

    public void setNext(Verificador_De_Login ver) {
        if (next == null) {
            next = ver;
        } else {
            next.setNext(ver);
        }
    }

    public void efetuarlogin(TiposCaractere Tip) throws Exception {
        if (podeEfetuarlogin(Tip)) {
            efetuarlogin();
        } else {
            if (next == null) {
                throw new Exception("Login Não Efetuado, Realize um cadastro!!!");
            }
            next.efetuarlogin(Tip);
        }
    }

    private boolean podeEfetuarlogin(TiposCaractere Tip) {
        if (identificadorCaractere == Tip) {
            return true;
        }
        return false;
    }
    protected abstract void efetuarlogin();
}
