package controlador;

import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

public class Controlador implements ActionListener{
    
    Modelo modelo;
    Vista vista;
    private boolean principio;
    

    public Controlador(Modelo modelo, Vista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        
        this.vista.btn0.addActionListener(this);
        this.vista.btn1.addActionListener(this);
        this.vista.btn2.addActionListener(this);
        this.vista.btn3.addActionListener(this);
        this.vista.btn4.addActionListener(this);
        this.vista.btn5.addActionListener(this);
        this.vista.btn6.addActionListener(this);
        this.vista.btn7.addActionListener(this);
        this.vista.btn8.addActionListener(this);
        this.vista.btn9.addActionListener(this);
        this.vista.btnBorrar.addActionListener(this);
        this.vista.btnComa.addActionListener(this);
        this.vista.btnDiv.addActionListener(this);
        this.vista.btnIgual.addActionListener(this);
        this.vista.btnMult.addActionListener(this);
        this.vista.btnResta.addActionListener(this);
        this.vista.btnSuma.addActionListener(this);       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(vista.btn0) ||
            e.getSource().equals(vista.btn1) ||
            e.getSource().equals(vista.btn2) ||
            e.getSource().equals(vista.btn3) ||
            e.getSource().equals(vista.btn4) ||
            e.getSource().equals(vista.btn5) ||
            e.getSource().equals(vista.btn6) ||
            e.getSource().equals(vista.btn7) ||
            e.getSource().equals(vista.btn8) ||
            e.getSource().equals(vista.btn9) ||
            e.getSource().equals(vista.btnComa)
            ) {
            
            String entrada=e.getActionCommand();
        
            if (principio) {

                vista.pantalla.setText("");

                principio=false;

            }

            vista.pantalla.setText(vista.pantalla.getText() + entrada);
            
        }else if (e.getSource().equals(vista.btnDiv) ||
                  e.getSource().equals(vista.btnIgual) ||
                  e.getSource().equals(vista.btnMult) ||
                  e.getSource().equals(vista.btnResta) ||
                  e.getSource().equals(vista.btnSuma)) {
            
            String operacion=e.getActionCommand();
        
            modelo.calcular(Double.parseDouble(vista.pantalla.getText()));

            modelo.ultimaOperacion=operacion;

            vista.pantalla.setText("" + modelo.resultado);

            principio=true;
            
        }else if (e.getSource().equals(vista.btnBorrar)) {
            
            vista.pantalla.setText("");
            modelo.resultado=0;
            
        }
        
    }
    
}
