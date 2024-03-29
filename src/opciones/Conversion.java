package opciones;

import clases.operaciones.ConversionLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

import static constantes.ConstantesT.*;

public class Conversion extends Frame {
    private static ConversionLogica conversionLogica = new ConversionLogica();
    private JPanel menuconversion;
    private JButton btnsalir;
    private JTextField txtcantidad;
    private JComboBox cbntipo;
    private JButton btncalcular;


    public Conversion(){
        add(menuconversion);


        setTitle(TC.getAa());
        setSize(500,600);
        btnsalir.addActionListener(e -> {
            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
        btncalcular.addActionListener(e -> {
            conversionLogica.setCantidad(Integer.parseInt(txtcantidad.getText()));
            conversionLogica.setConvertir(cbntipo.getSelectedIndex());
            conversionLogica.logica();

        });

    }
    private void esconderVentana() {
        this.dispose();

    }
}
