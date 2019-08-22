package opciones.operacionesmatematicas;

import static clases.constantes.MatematicaString.*;
import static clases.constantes.MatematicasInt.*;
import clases.operaciones.MatematicaLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

public class OperacionesMatematicas extends Frame {
    private static MatematicaLogica matematicaLogica = new MatematicaLogica();

    protected JPanel form;
    protected JTextField txtnumero1;
    protected JButton btnmas;
    protected JButton btnmenos;
    protected JButton btnmultiplicar;
    protected JButton btndividir;
    protected JTextField txtnumero2;
    protected JLabel lblresultado;
    protected JButton btnsalir;

    public OperacionesMatematicas() {
        add(form);

        setTitle(HOLA.getA());
        setSize(V500.getValor(), V600.getValor());
        btnsalir.addActionListener(e -> {

            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();

        });


        btnmas.addActionListener(e -> {

            datos(txtnumero1.getText(), txtnumero2.getText());

            lblresultado.setText(String.valueOf(matematicaLogica.calcularSuma()));

        });
        btnmenos.addActionListener(e -> {
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicaLogica.calcularResta()));

        });
        btnmultiplicar.addActionListener(e -> {
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicaLogica.calcularMultiplicacion()));

        });
        btndividir.addActionListener(e -> {

            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicaLogica.calcularDivicion()));

        });
    }

    private void esconderVentana() {
        this.dispose();

    }

    private void datos(String valor1, String valor2) {
        matematicaLogica.setNumero1(Double.parseDouble(valor1));
        matematicaLogica.setNumero2(Double.parseDouble(valor2));


        lblresultado.setVisible(true);
    }

}
