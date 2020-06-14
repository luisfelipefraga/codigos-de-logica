import java.util.Scanner;
/**
 * @author Lus Felipe Fraga
 * @version 1.0
 * @since 01/06/2020 - 10:49
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
        System.out.println("\f");
        Categoria categoria = new Categoria("Pedro",18);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        categoria.setNome(scanner.next());
        System.out.println("Digite sua idade:");
        categoria.setIdade(scanner.nextInt());
        System.out.println(categoria);
    }
}

