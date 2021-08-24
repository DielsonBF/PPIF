
package atividade_factory;

import javax.swing.JOptionPane;


public class Atividade_Factory {

   
    public static void main(String[] args) {
       Fabrica_Esportiva_Factory fac = new Fabrica_Esportiva_Factory();
        String marca_usada ;
        String time_Escolihdo ;
        marca_usada = JOptionPane.showInputDialog("Digite a marca ");
        time_Escolihdo = JOptionPane.showInputDialog("Digite o time ");
        System.out.println("Marca: "+marca_usada);
        System.out.println("Time: "+time_Escolihdo); 
    }
    
}
