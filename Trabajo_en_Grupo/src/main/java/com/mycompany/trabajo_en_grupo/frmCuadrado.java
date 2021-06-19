/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_en_grupo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author leski
 */
public class frmCuadrado extends JFrame {

    public frmCuadrado() {
        componentescuadrado();
    }

    private JButton Perimetro;
    private JButton btnarea;
    private JTextField txt1;
    
    private JLabel lblresultado;
    private JPanel panel;

    private void componentescuadrado() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txt1 = new JTextField("0", 15);
        txt1.setFocusable(true);
        txt1.setBackground(Color.LIGHT_GRAY);
        
        
        
        lblresultado = new JLabel();

        Perimetro = new JButton("PERIMETRO");
        Perimetro.addMouseListener(new Perimetro());

        btnarea = new JButton("AREA");
        btnarea.addMouseListener(new Area());

        panel = new JPanel();
        panel.add(btnarea);
        panel.add(Perimetro);
        panel.add(txt1);
        
        panel.add(lblresultado);

        setContentPane(panel);
        setVisible(true);
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClioked(MouseEvent e) {
            int num1 = Integer.parseInt(txt1.getText());
            lblresultado.setText("=" + (num1 * 4));
            
        }

    }

    private class Area extends MouseAdapter {

        public void mouseClioked(MouseEvent e) {
            int num1 = Integer.parseInt(txt1.getText());
            lblresultado.setText("=" + (num1 * 2));
        }

    }
}
