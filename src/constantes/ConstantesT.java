package constantes;

public enum ConstantesT {
    D("Dolar"),
    TC("Conversion"),
    E("Euro"),
    Y("Yen");



    private String b;
    ConstantesT(String s) {
        this.b = s;
    }

    public String getAa() {
        return b;
    }
}
