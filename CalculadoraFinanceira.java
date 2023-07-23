import java.lang.Math;

public class CalculadoraFinanceira {

    static double calcularJurosSimples(Investimento investimento) {

        return investimento.valorInicial +
                ((investimento.valorInicial * (investimento.taxaDeJuros / 100)) * investimento.tempoEmAnos);
    }

    static  double calcularJurosCompostos(Investimento investimento) {
        double tempoEmMeses = investimento.tempoEmAnos * 12;
        double taxaDeJurosMensal = 1 + (investimento.taxaDeJuros / 100);

        return investimento.valorInicial *  Math.pow(taxaDeJurosMensal, tempoEmMeses);

    }

    static double calcularDesconto(double valorInicialProduto, double percentualDesconto) {

        return valorInicialProduto - (valorInicialProduto * (percentualDesconto / 100));
    }

    static double calcularParcelas(double valorTotalCompra, int quantidadeParcelas) {

        return valorTotalCompra / quantidadeParcelas;
    }
}
