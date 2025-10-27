import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        //Loop de opções1
        while (true) {
            System.out.println("\nOpções: 1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão |  5-Histórico | 0-Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            if (op == 5) {
                calc.mostrarHistorico();
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            // nenhuma operação selecionada
            Operacao operacao = null;

            // Acho que switch é melhor que if
            switch (op) {
                case 1: operacao = new Soma(a, b); break;
                case 2: operacao = new Subtracao(a, b); break;
                case 3: operacao = new Multiplicacao(a, b); break;
                case 4: operacao = new Divisao(a, b); break;
                default: System.out.println("Opção não existe!"); continue;
            }

            double resultado = calc.executar(operacao);
            System.out.println("Resultado: " + resultado);
        }
        // fecha o menu principal de operações
        sc.close();
        System.out.println("Vlw patrão!");
    }
}