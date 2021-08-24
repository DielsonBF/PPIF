
package ativ_prototype;

import java.util.Scanner;


public class Ativ_Prototype {

 
    public static void main(String[] args) {
      Tipo_Violao7Cordas toque1 = new Tipo_Violao7Cordas();
        Fab_Violao escolha1 = toque1.clonar();
        Scanner tipvi = new Scanner(System.in);
        System.out.println(escolha1.exibirInfo());
        System.out.println("Digite qual tipo de violão Melhor se Adapta");
        String Marca = tipvi.next();
        System.out.println("Tipo de marca escolhida pelo usuario " +Marca);
    }
    
}
