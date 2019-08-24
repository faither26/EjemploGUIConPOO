package clases.operaciones;

public class Conversion {
    private int cantidad;
    private int convertir;

    public Conversion(int cantidad, int convertir) {
        this.cantidad = cantidad;
        this.convertir = convertir;
    }

    public Conversion() {
        this.cantidad = 0;
        this.convertir = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getConvertir() {
        return convertir;
    }

    public void setConvertir(int convertir) {
        this.convertir = convertir;
    }
}
