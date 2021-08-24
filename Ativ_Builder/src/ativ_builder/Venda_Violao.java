
package ativ_builder;


public class Venda_Violao {
       protected Builder direcaovenda;

    public Venda_Violao(Builder direcaovenda) {
        this.direcaovenda = direcaovenda;
    }

    public void ViolaoVender() {
        direcaovenda.TipoDeTarraxa();
        direcaovenda.TipoMaterialCorpo();
        direcaovenda.buildCor();
        direcaovenda.buildPreco();
        direcaovenda.buildTamanhoDoBarço();
        direcaovenda.buildTipoCorda();
    }

    public Violao getViolao() {
        return direcaovenda.getviolao();
    }
}
