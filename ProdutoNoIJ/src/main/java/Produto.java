public class Produto {

    String descricao;
    String fornecedor;
    double valorCusto;
    int quantidade;


    public double calcularValorEmEstoque() {
        return this.valorCusto * this.quantidade;
    }

    public double adicionarAoValorCusto() {
        return this.valorCusto * 1.65;
    }

    public double adicionarQualquerPorcentagemAoValorCusto(int porcentagem) {
        return this.valorCusto + this.valorCusto * (porcentagem/100);
    }

    public String toString() {
        return ("Descrição do produto:" + this.descricao
                +"\n Fornecedor: " + this.fornecedor
                +"\n Valor de custo:" + this.valorCusto
                +"\n Quantidade em estoque: " + this.quantidade
                +"\n Valor em estoque: " + this.calcularValorEmEstoque()
                +"\n Valor custo com acréscimo de 65%: \n" + this.adicionarAoValorCusto()

        );
    }

}