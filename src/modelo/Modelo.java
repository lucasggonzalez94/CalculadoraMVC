package modelo;

import java.awt.event.ActionEvent;
import vista.*;

public class Modelo {
    
    public double resultado=0;
    public String ultimaOperacion="=";
    
    public void calcular(double n) {
        
        if (ultimaOperacion.equals("+")) {
            
            resultado+=n;
            
        }else if (ultimaOperacion.equals("-")) {
            
            resultado-=n;
            
        }else if (ultimaOperacion.equals("*")) {
            
            resultado*=n;
            
        }else if (ultimaOperacion.equals("/")) {
            
            resultado/=n;
            
        }else if (ultimaOperacion.equals("=")) {
            
            resultado=n;
            
        }
        
    }
    
}
