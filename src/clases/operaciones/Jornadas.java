package clases.operaciones;


public class Jornadas {

    private int horas;
    private int dia;
    private int jornada;

    public Jornadas(int horas, int dia, int jornada) {
        this.horas = horas;
        this.dia = dia;
        this.jornada = jornada;
    }
    public Jornadas() {
        this.horas = 0;
        this.dia = 0;
        this.jornada = 0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
}

