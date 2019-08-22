package menu;

import static clases.constantes.MatematicaString.*;
import static clases.constantes.MatematicasInt.*;
import opciones.operacionesmatematicas.OperacionesMatematicas;
import opciones.turnos.Turnos;

import javax.swing.*;
import java.awt.*;



public class Menu extends Frame {

    private JPanel menuprincipal;
    private JButton operacionesMatematicasButton;
    private JButton btnturnos;

    public Menu() {
        add(menuprincipal);

        setTitle(MENU.getA());
        setSize(V500.getValor(), V600.getValor());
        operacionesMatematicasButton.addActionListener(e -> {


            OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
            operacionesMatematicas.setVisible(true);
            this.esconderVentana();

        });
        btnturnos.addActionListener(e -> {
            Turnos turnos = new Turnos();
            turnos.setVisible(true);
            this.esconderVentana();
        });
    }

    private void esconderVentana() {
        this.dispose();
    }
}
