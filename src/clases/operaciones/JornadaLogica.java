package clases.operaciones;

public class JornadaLogica extends Jornadas {
    double resultado;

    public double calculcarjornada() {
        if (this.getDia() == 6) {
            if (this.getJornada() == 0) {
                resultado = ((this.getHoras() * 35000) + ((this.getHoras() * 35000) * 0.1));
            } else if (this.getJornada() == 1) {

                resultado = (((6 * 50000) * 0.15) + ((this.getHoras() - 6) * 35000) * 0.1);
            }
        } else if (this.getDia() == 5) {
            if (getJornada() == 0) {
                resultado = (this.getHoras() * 35000);
            } else if (this.getJornada() == 1) {
                resultado = (int) (((6 * 35000) * 0.1) + ((this.getHoras() - 6) * 50000) * 0.15);
            }
        } else {
            if (this.getJornada() == 0) {
                resultado = (this.getHoras() * 35000);
            } else if (this.getJornada() == 1) {

                resultado = (this.getHoras() * 50000);
            }
        }
        return resultado;
    }

}
