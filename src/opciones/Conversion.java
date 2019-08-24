package opciones;

import clases.operaciones.ConversionLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;
public class Conversion extends Frame {
    ConversionLogica conversionLogica = new ConversionLogica();
    private JPanel menuconversion;
    private JButton btnsalir;
    private JTextField txtcantidad;
    private JComboBox cbntipo;
    private JButton btncalcular;
    private JLabel lblresultado;

    public Conversion(){
        add(menuconversion);


        setTitle("Conversion");
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
