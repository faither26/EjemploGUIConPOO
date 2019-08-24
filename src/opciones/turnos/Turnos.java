package opciones.turnos;

import clases.operaciones.JornadaLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;


public class Turnos extends Frame {
    private static JornadaLogica jornadaLogica = new JornadaLogica();
    protected JPanel menuTurnos;
    protected JTextField txthoras;
    protected JComboBox cmbdias;
    protected JComboBox cmbturnos;
    protected JButton btnsalir;
    protected JButton calcularButton;
    private JTextField txtnombre;

    public Turnos(){


        add(menuTurnos);

        setTitle("Jornadas");
        setSize(500,600);

        btnsalir.addActionListener(e ->{

            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
        calcularButton.addActionListener(e ->  {
            jornadaLogica.setDia(cmbdias.getSelectedIndex());
            jornadaLogica.setJornada(cmbturnos.getSelectedIndex());
            jornadaLogica.setHoras(Integer.parseInt(txthoras.getText()));
            JOptionPane.showMessageDialog(null,txtnombre.getText()+" su sueldo trabajado es "+jornadaLogica.calculcarjornada());

        });
    }

    private void esconderVentana() {
        this.dispose();

    }
}
