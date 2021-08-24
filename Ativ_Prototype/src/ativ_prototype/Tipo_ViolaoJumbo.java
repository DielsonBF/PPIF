
package ativ_prototype;


public class Tipo_ViolaoJumbo extends Fab_Violao{
              protected Tipo_ViolaoJumbo(Tipo_ViolaoJumbo m12cordas){
        this.marca = m12cordas.getmarca();
    }
    public Tipo_ViolaoJumbo(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fab_Violao clonar() {
        return new Tipo_ViolaoJumbo(this);
    }
}
