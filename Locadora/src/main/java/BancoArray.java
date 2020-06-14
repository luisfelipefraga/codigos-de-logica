import java.util.ArrayList;
import java.util.List;

/**
 * @author Luis Felipe Fraga
 * @since 07/06/2020 - 14:45
 * @version 1.0
 */
public class BancoArray implements BancoArrayInterface{

    List<Filmes> locadora;

    public BancoArray() {
        locadora = new ArrayList<>();
    }

    @Override
    public void cadastrar(Filmes filmes) {
        this.locadora.add(filmes);
    }

    @Override
    public List<Filmes> buscar() {
        return this.locadora;
    }

    @Override
    public void excluir(int index) {
        this.locadora.remove(index);
    }

    @Override
    public void alterar(int index, Filmes filmes) {
        this.locadora.add(index, filmes);
    }

    @Override
    public Filmes filtrar(Filmes filmes, int filtro) {
        switch (filtro) {
            case 1:
                for(Filmes filmesAuxiliar : this.locadora) {
                    if(filmesAuxiliar.getNomeDoFilme().contains(filmes.getNomeDoFilme())) {
                        return filmesAuxiliar;
                    }
                }
                break;
            case 2:
                for(Filmes filmesAuxiliar : this.locadora) {

                    if(filmesAuxiliar.getCategoria().contains(filmes.getCategoria())) {
                         return filmesAuxiliar;
                    }
                }
                break;
            case 3:
                for(Filmes filmesAuxiliar : this.locadora) {
                    if(filmesAuxiliar.getPreco() == filmes.getPreco()) {
                        return filmesAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.locadora.size();
    }

    @Override
    public void apagarFilmes() {
        this.locadora.clear();
    }
}
