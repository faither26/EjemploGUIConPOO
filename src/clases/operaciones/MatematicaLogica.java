package clases.operaciones;

public class MatematicaLogica extends Matematicas{
    public double calcularSuma(){
        return (this.getNumero1()+this.getNumero2());


    }

    public double calcularResta(){
        return (this.getNumero1()-this.getNumero2());
    }

    public double calcularMultiplicacion(){
        return (this.getNumero1()*this.getNumero2());
    }
    public double calcularDivicion(){
        return (this.getNumero1()/this.getNumero2());
    }
}
