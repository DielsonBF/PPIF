
package ativ_prototype;


public class Tipo_ViolaoFolk extends Fab_Violao{
             protected Tipo_ViolaoFolk(Tipo_ViolaoFolk m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoFolk(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoFolk(this);
    }
}
