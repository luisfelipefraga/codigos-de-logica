import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        int opcao;

        System.out.println("\f");

        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        produto.descricao = "produto útil";
        produto.fornecedor = "Nike";
        produto.valorCusto = 2.50;
        produto.quantidade = 20;

        System.out.print(produto.toString());
        System.out.print("Digite a porcentagem desejada: ");
        opcao = scanner.nextInt();
        System.out.println("Valor custo com a porcentagem desejada: " + produto.adicionarQualquerPorcentagemAoValorCusto(opcao));
    }

}
