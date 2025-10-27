public class Multiplicacao extends Operacao {
    public Multiplicacao(double a, double b) { super(a, b); }
    public double calcular() { return a * b; }
    public String toString() { return a + " * " + b; }
}