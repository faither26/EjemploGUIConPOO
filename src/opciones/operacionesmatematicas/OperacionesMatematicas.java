package opciones.operacionesmatematicas;

import menu.Menu;

import javax.swing.*;

public class OperacionesMatematicas extends JFrame {
    private JPanel operacionesM;
    private JTextField txtnumero1;
    private JButton btnmas;
    private JButton btnmenos;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JTextField txtnumero2;
    private JLabel lblresultado;
    private JButton btnsalir;

    public OperacionesMatematicas() {
        add(operacionesM);

        setTitle("Opció operaciones Matematicas");
        setSize(500, 600);
        btnsalir.addActionListener(e ->  {

                Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();

        });
    }

    private void esconderVentana() {
        this.dispose();
    }

}
