// salva os inputs do usuário.

// calculdora que não gosta de decimais

public abstract class Operacao {
    protected double a, b;
    public Operacao(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public abstract double calcular();
    public abstract String toString();
}