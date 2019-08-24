package clases.operaciones;

public class ConversionMoneda extends Conversion {
    public int euro(){
        return this.getCantidad()*3500;
    }
    public int dolar(){
        return this.getCantidad()*3000;
    }
    public int yen(){
        return this.getCantidad()*1500;
    }
}
