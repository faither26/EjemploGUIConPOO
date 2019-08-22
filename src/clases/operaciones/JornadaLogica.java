package clases.operaciones;

public class JornadaLogica extends Jornadas {


    public int calculcarjornada() {
        if (this.getDia() == "7.Domingo") {
            if (this.getJornada() == "1.Diurno") {
                return (int) ((this.getHoras() * 35000) + ((this.getHoras() * 35000) * 0.1));
            } else if (this.getJornada() == "2.Nocturno") {

                return (int) (((6 * 50000)*0.15) + ((this.getHoras() - 6) * 35000) * 0.1);
            }
        } else if (this.getDia()=="6.Sabado") {
            if (getJornada()=="1.Diurno"){
                return (this.getHoras()*35000);
            }else if (this.getJornada()=="2.Nocturno"){
                return (int) (((6 * 35000)*0.1) + ((this.getHoras() - 6) * 50000) * 0.15);
            }
        } else {
            if (this.getJornada() == "1.Diurno") {
                return (this.getHoras() * 35000);
            } else if (this.getJornada() == "2.Nocturno") {

                return (int) (this.getHoras() * 50000);
            }
        }
        return 0;
    }

}
