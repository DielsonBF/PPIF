
package ativ_prototype;


public abstract class Fab_Violao {
        protected String marca;
        public abstract String exibirInfo();
        public abstract Fab_Violao clonar();
        public String getmarca(){
    return marca;
}
         public void setmarca(String Marca){
             this.marca = Marca;
         }
}
