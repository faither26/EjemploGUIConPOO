package clases.constantes;

public enum MatematicasInt {
    CERO(0),
    V500(500),
    V600(600);

    private int valor;


    MatematicasInt(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
