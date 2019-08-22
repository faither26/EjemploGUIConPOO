package clases.operaciones;


public class Jornadas {
    private int horas;
    private String dia;
    private String jornada;

    public Jornadas() {
        this.horas = 0;
        this.dia = "";
        this.jornada = "";
    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}

