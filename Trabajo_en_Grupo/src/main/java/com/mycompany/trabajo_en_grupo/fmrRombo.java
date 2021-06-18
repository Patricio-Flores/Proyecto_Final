
package com.mycompany.trabajo_en_grupo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class fmrRombo extends Frame{
    public fmrRombo (){
        cargarComponentes();
        
    }
    
   
    private JPanel panel;
    private JTextField txtDiagonalMa, txtAlDiagonalMe,txtLado;
    private JButton btnArea, btnPerimetro;
    private JLabel lblResultado;
    
    private void cargarComponentes(){
        setSize (400, 200);
        
        txtDiagonalMa = new JTextField("0",10);
        txtDiagonalMa.setFocusable(true);
        txtDiagonalMa.setBackground(Color.white);
       
        
        txtAlDiagonalMe = new JTextField("0",10);
        txtAlDiagonalMe.setBackground(Color.WHITE);
        
         txtLado = new JTextField("0",10);
        txtLado.setBackground(Color.WHITE);
        
        lblResultado = new JLabel();
        
        btnArea = new JButton ("AREA ");
        btnArea. addMouseListener(new areRombo());
         
        btnPerimetro = new JButton ("PERIMETRO");
        btnPerimetro. addMouseListener(new primetroRombo());
        
       
        panel = new JPanel();
        panel.add (txtDiagonalMa);
        panel.add (txtAlDiagonalMe);
        panel.add(txtLado);
        panel.add (lblResultado);
        panel.add (btnArea);
        panel.add (btnPerimetro);
        
        setContentPane(panel);
        setVisible(true);
        
        
        
    }

    private void setContentPane(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
private class areRombo extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int base = Integer.parseInt(txtDiagonalMa.getText());
       int altura = Integer.parseInt(txtAlDiagonalMe.getText());
       lblResultado.setText("="+((base*altura)/2));
    }
    
}
    
 private class primetroRombo extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int lado = Integer.parseInt(txtLado.getText());
       lblResultado.setText("="+(lado*4));
    }
    
}

}
    

