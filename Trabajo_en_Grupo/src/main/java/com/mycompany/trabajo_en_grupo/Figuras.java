/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_en_grupo;
import javax.swing.*;
public class  Figuras extends JFrame {
    
    public Figuras() {
        cargarComponentes();
    }
   
   private JPanel panel;
    private JButton btnCirculo;
    private JButton btnCuadrado;
    private JButton btnRomboide;
    private JButton btnRectagulo;
    private JButton btnRombo;
    private JButton btnTrapecio;
    private JButton btnPoligono;
    private JButton btnTriangulo;
     private void cargarComponentes() {
          setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnCirculo=new JButton("Circulo");
        btnCuadrado=new JButton("Cuadrado");
        btnPoligono=new JButton("Poligono");
        btnRectagulo=new JButton("Rectangulo");
        btnRombo=new JButton("Rombo");
        btnRomboide=new JButton("Romboide");
        btnTrapecio=new JButton("Trapecio");
        btnTriangulo=new JButton("Triangulo");
        
         panel = new JPanel();
        panel.add(btnCuadrado);
        panel.add(btnCirculo);
        panel.add(btnPoligono);
        panel.add(btnRectagulo);
        panel.add(btnRombo);
        panel.add(btnRomboide);
        panel.add(btnTrapecio);
        panel.add(btnTriangulo);
        setContentPane(panel);
        setVisible(true);
     }
}
