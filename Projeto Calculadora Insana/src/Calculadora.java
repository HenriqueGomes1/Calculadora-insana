public class Calculadora {
    private Historico historico = new Historico();

    public double executar(Operacao op) {
        double resultado = op.calcular();
        historico.adicionar(op.toString() + " = " + resultado);
        return resultado;
    }

    public void mostrarHistorico() {
        historico.mostrar();
    }
}