
package ativ_builder;

public class Ativ_Builder {

   
    public static void main(String[] args) {
        Venda_Violao vendaviolao = new Venda_Violao(new Tipo_ViolaoFolk());
        vendaviolao.ViolaoVender();
        Violao vio = vendaviolao.getViolao();
        System.out.println("Cor: " + vio.cor + "/n: " + vio.tamanhodobarço
                + "\n: " + vio.tipodacorda + "\n: "
                + vio.tipodetarraxa + "\n: " + vio.tipomaterialcorpo + "\n " + vio.preco);
        System.out.println();
    }
    
}
