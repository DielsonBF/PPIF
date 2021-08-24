
package ativ_prototype;


public class Tipo_ViolaoFlet extends Fab_Violao{
            protected Tipo_ViolaoFlet(Tipo_ViolaoFlet m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoFlet(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoFlet(this);
    }
}
