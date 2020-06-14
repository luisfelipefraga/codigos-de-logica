import java.util.List;

/**
 * @author Luis Felipe Fraga
 * @since 07/06/2020 - 14:20
 * @version 1.0
 */
public interface BancoArrayInterface {

    public void cadastrar(Filmes filmes);
    public List<Filmes> buscar();
    public void excluir(int index);
    public void alterar(int index, Filmes filmes);
    public Filmes filtrar(Filmes filmes, int filtro);
    public int verificarQuantidade();
    public void apagarFilmes();

}
