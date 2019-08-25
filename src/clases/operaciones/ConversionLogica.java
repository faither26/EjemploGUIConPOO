package clases.operaciones;

import javax.swing.*;

import static constantes.ConstantesT.*;


public class ConversionLogica extends ConversionMoneda {

    public void logica() {
        switch (this.getConvertir()) {
            case 0:
                JOptionPane.showMessageDialog(null, E.getAa()+" " + this.getCantidad() + " = " + this.euro() + "$");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, D.getAa()+" " + this.getCantidad() + " = " + this.dolar() + "$");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, Y.getAa()+" " + this.getCantidad() + " = " + this.yen() + "$");
                break;
            default:
        }


    }
}
