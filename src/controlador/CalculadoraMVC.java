package controlador;

import modelo.Modelo;
import vista.Vista;

public class CalculadoraMVC {

    public static void main(String[] args) {
        
        Vista vista=new Vista();
        Modelo modelo=new Modelo();
        Controlador controlador=new Controlador(modelo, vista);
        
    }
    
}
