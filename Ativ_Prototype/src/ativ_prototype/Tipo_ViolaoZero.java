
package ativ_prototype;


public class Tipo_ViolaoZero extends Fab_Violao{
                  protected Tipo_ViolaoZero(Tipo_ViolaoZero m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoZero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoZero(this);
    }
}
