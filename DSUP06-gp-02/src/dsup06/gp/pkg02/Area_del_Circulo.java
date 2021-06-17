/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsup06.gp.pkg02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author leski
 */
public class Area_del_Circulo {

    /**
     * @param args the command line arguments
     */
    public static double r2;
    public static void main(String[] args) {
       
        try{
             
       Circulo c=new Circulo(r2);
             
                 JOptionPane.showMessageDialog(null,"El area del Circulo es: "+c.area());
             
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese solo valores numericos enteros: ");
        System.out.println("Error: "+e.getLocalizedMessage());
        e.printStackTrace();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error comuciquese con el programador  ");
        System.out.println("Error en el Programa "+e.getLocalizedMessage());
        }
    }
    
}
