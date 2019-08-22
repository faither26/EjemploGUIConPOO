package opciones.turnos;

import clases.operaciones.JornadaLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;


public class Turnos extends Frame {
    JornadaLogica jornadaLogica = new JornadaLogica();
    protected JPanel menuTurnos;
    protected JTextField txthoras;
    protected JComboBox cmbdias;
    protected JComboBox cmbturnos;
    protected JButton btnsalir;
    protected JButton calcularButton;
    protected JLabel lblresultado;

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
            jornadaLogica.setDia(String.valueOf(cmbdias));
            jornadaLogica.setJornada(String.valueOf(cmbturnos));
            jornadaLogica.setHoras(Integer.parseInt(txthoras.getText()));

            lblresultado.setText(String.valueOf(jornadaLogica.calculcarjornada()));

            lblresultado.setVisible(true);
        });
    }

    private void esconderVentana() {
        this.dispose();

    }
}
