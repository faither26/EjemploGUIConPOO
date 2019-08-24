package clases.operaciones;

import javax.swing.*;

public class ConversionLogica extends ConversionMoneda {

    public void logica() {
        int cantidad = 0;
        switch (this.getConvertir()){
            case 0:
                JOptionPane.showMessageDialog(null,"euro "+this.getCantidad()+" = "+this.euro()+"$");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"dolar "+this.getCantidad()+" = "+this.dolar()+"$");                break;
            case 2:
                JOptionPane.showMessageDialog(null,"yen "+this.getCantidad()+" = "+this.yen()+"$");
        }

    }
}
