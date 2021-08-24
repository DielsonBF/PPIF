
package ativ_prototype;


public class Tipo_ViolaoTriploZero extends Fab_Violao{
                 protected Tipo_ViolaoTriploZero(Tipo_ViolaoTriploZero m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoTriploZero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoTriploZero(this);
    }
}
