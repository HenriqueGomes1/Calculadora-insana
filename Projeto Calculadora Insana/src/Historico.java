import java.util.ArrayList;

public class Historico {
    private ArrayList<String> operacoes = new ArrayList<>();
    public void adicionar(String operacao) {
        operacoes.add(operacao);
    }
    public void mostrar() {
        if (operacoes.isEmpty()) {
            System.out.println("Nenhuma operação foi feita.");
        } else {
            for (String op : operacoes) {
                System.out.println(op);
            }
        }
    }
}