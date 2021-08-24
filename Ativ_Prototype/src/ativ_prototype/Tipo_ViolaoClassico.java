
package ativ_prototype;


public class Tipo_ViolaoClassico extends Fab_Violao{
       protected Tipo_ViolaoClassico(Tipo_ViolaoClassico m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoClassico(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoClassico(this);
    }
}
