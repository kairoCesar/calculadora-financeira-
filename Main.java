public class Main {
    public static void main(String[] args) {
        Investimento investimento = new Investimento();

        investimento.valorInicial = 620;
        investimento.taxaDeJuros = 1.5;
        investimento.tempoEmAnos = 2;


        System.out.println(CalculadoraFinanceira.calcularDesconto(100, 20));
        System.out.println(CalculadoraFinanceira.calcularParcelas(100, 5));

    }
}