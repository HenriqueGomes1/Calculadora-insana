public class Divisao extends Operacao {
    public Divisao(double a, double b) { super(a, b); }
    public double calcular() { return b != 0 ? a / b : 0; }
    public String toString() { return a + " / " + b; }
}