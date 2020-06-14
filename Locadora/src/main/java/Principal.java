import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luis Felipe Fraga
 * @since 07/06/2020 15:07
 * @category View
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    BancoArray locadora = new BancoArray();

    Filmes filmes = null;

    int opcao = 0;
    do {
        System.out.println("I----MENU----I\n1-Cadastrar Filme\n2-Ver Filmes Cadastrados\n3-Deletar\n4-Filtrar\n5-Ver Quantidade de Filmes\n6-Limpar Filmes\n0-Sair");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                filmes = new Filmes();
                System.out.println("Digite o nome do filme: ");
                filmes.setNomeDoFilme(scanner.next());
                System.out.println("Digite o tempo de duração do filme: ");
                filmes.setTempoDuracao(scanner.nextInt());
                System.out.println("Digite a classificação indicativa do filme: ");
                filmes.setClassificacaoIndicativa(scanner.next());
                System.out.println("Digite a categoria do filme:");
                filmes.setCategoria(scanner.next());
                System.out.println("Digite o preço do filme: ");
                filmes.setPreco(scanner.nextDouble());

                locadora.cadastrar(filmes);
                System.out.println("Filme cadastrado com sucesso!");
                break;
            case 2:
                if(locadora.verificarQuantidade() != 0) {
                    System.out.println("--FILMES--");
                    locadora.buscar().forEach(System.out::println);
                } else {
                    System.out.println("Não há filmes cadastrados!");
                }
                break;
            case 3:
                System.out.println("Digite uma posição para excluir:");
                int index = scanner.nextInt();
                locadora.excluir(index);
                System.out.println("Filme apagado com sucesso!");
                break;
            case 4:
                filmes = new Filmes();
                System.out.println("Como deseja filtrar:\n1-Nome do Filme\n2-Categoria do Filme\n3-Preço do filme");
                int opcaoFiltro = scanner.nextInt();
                switch (opcaoFiltro) {
                    case 1:
                        System.out.println("Digite o nome do filme que deseja filtrar:");
                        filmes.setNomeDoFilme(scanner.next());
                        filmes = locadora.filtrar(filmes, 1);
                        System.out.println(filmes != null ? filmes : "Filmes não encontrado!");
                    break;
                    case 2:
                        System.out.println("Digite a categoria do filme desejada:");
                        filmes.setCategoria(scanner.next());
                        filmes = locadora.filtrar(filmes, 2);

                        System.out.println(filmes != null ? filmes : "Filmes não encontrados!");
                        break;
                    case 3:
                        System.out.println("Digite o preço a ser filtrado:");
                        filmes.setPreco(scanner.nextDouble());
                        filmes = locadora.filtrar(filmes, 3);
                        System.out.println(filmes != null ? filmes : "Filmes não encontrados!");
                        break;
                    default:
                        System.out.println("Opção Invalida!");
                    break;

                }

                break;
            case 5:
                System.out.println("Há " + locadora.verificarQuantidade() + " filme(s)");
                break;
            case 6:
                locadora.apagarFilmes();
                System.out.println("Filmes Apagados!");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }

    } while(opcao != 0);
       }
}
