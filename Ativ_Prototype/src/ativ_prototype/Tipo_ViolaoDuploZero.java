
package ativ_prototype;


public class Tipo_ViolaoDuploZero extends Fab_Violao{
          protected Tipo_ViolaoDuploZero(Tipo_ViolaoDuploZero m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoDuploZero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoDuploZero(this);
    }
}
