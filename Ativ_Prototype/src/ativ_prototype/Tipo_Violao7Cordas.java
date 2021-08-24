
package ativ_prototype;


public class Tipo_Violao7Cordas extends Fab_Violao{
           protected Tipo_Violao7Cordas(Tipo_Violao7Cordas m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_Violao7Cordas(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_Violao7Cordas(this);
    }
}
