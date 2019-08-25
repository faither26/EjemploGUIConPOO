package constantes;

public enum ConstatntesN {

    VDIA(35000.0),
    VDIAN(50000.0),
    P1(0.1),
    P2(0.15);

    private Double a;
    ConstatntesN(Double s) {
        this.a = s;
    }

    public Double getAa() {
        return a;
    }
}
