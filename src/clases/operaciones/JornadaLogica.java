package clases.operaciones;

import static constantes.ConstatntesN.*;

public class JornadaLogica extends Jornadas {
    double resultado;

    public double calculcarjornada() {
        if (this.getDia() == 6) {
            if (this.getJornada() == 0) {
                resultado = ((this.getHoras() * VDIA.getAa()) + ((this.getHoras() * VDIA.getAa()) * P1.getAa()));
            } else if (this.getJornada() == 1) {

                resultado = (((6 * VDIAN.getAa()) * P2.getAa()) + ((this.getHoras() - 6) * VDIA.getAa()) * P1.getAa());
            }
        } else if (this.getDia() == 5) {
            if (getJornada() == 0) {
                resultado = (this.getHoras() * VDIA.getAa());
            } else if (this.getJornada() == 1) {
                resultado = (int) (((6 * VDIA.getAa()) * P1.getAa()) + ((this.getHoras() - 6) * VDIAN.getAa()) * P2.getAa());
            }
        } else {
            if (this.getJornada() == 0) {
                resultado = (this.getHoras() * VDIA.getAa());
            } else if (this.getJornada() == 1) {

                resultado = (this.getHoras() * VDIAN.getAa());
            }
        }
        return resultado;
    }

}
