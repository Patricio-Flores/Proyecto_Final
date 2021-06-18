
package com.mycompany.trabajo_en_grupo;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FmrRectabgulo extends Frame{
        public FmrRectabgulo (){
        cargarComponentes();
    }
    private JPanel panel;
    private JTextField txtBase, txtAltura;
    private JButton btnArea, btnPerimetro;
    private JLabel lblResultado;
    
    private void cargarComponentes(){
        setSize (400, 200);
        
        txtBase = new JTextField("0",10);
        txtBase.setFocusable(true);
        txtBase.setBackground(Color.WHITE);
       
        
        txtAltura = new JTextField("0",10);
        txtAltura.setBackground(Color.WHITE);
        
        lblResultado = new JLabel();
        
        btnArea = new JButton ("AREA ");
        btnArea. addMouseListener(new areRectangulo());
         
        btnPerimetro = new JButton ("PERIMETRO");
        btnPerimetro. addMouseListener(new primetroRectangulo());
        
       
        panel = new JPanel();
        panel.add (txtBase);
        panel.add (txtAltura);
        panel.add (lblResultado);
        panel.add (btnArea);
        panel.add (btnPerimetro);
        
        setContentPane(panel);
        setVisible(true);
        
        
        
    }

    private void setContentPane(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
private class areRectangulo extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int base = Integer.parseInt(txtBase.getText());
       int altura = Integer.parseInt(txtAltura.getText());
       lblResultado.setText("="+((base*altura)/2));
    }
    
}
    
 private class primetroRectangulo extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int base = Integer.parseInt(txtBase.getText());
       int altura = Integer.parseInt(txtAltura.getText());
       lblResultado.setText("="+((base*2)+(altura*2)));
    }
    
}

}