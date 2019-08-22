package clases.constantes;

public enum MatematicaString {
    HOLA("Opció operaciones MatematicaString"),
    MENU("menu principal");

    String a;

    MatematicaString(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}
