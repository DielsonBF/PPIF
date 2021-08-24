
package ativ_prototype;


public class Tipo_Violao12Cordas extends Fab_Violao{
        protected Tipo_Violao12Cordas(Tipo_Violao12Cordas m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_Violao12Cordas(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_Violao12Cordas(this);
    }
}
