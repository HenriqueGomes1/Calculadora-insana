public class Subtracao extends Operacao {
    public Subtracao(double a, double b) { super(a, b); }
    public double calcular() { return a - b; }
    public String toString() { return a + " - " + b; }
}