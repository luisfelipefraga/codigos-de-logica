/**
 * @author Luis Felipe Fraga
 * @since 07/06/2020 13:20
 * @category Model
 * @version 1.0
 */

public class Filmes {
    private String nomeDoFilme;
    private String classificacaoIndicativa;
    private String categoria;
    private int tempoDuracao;
    private double preco;

    public Filmes() {
    }

    /**
     * @param nomeDoFilme recebe o nome do filme por padrão
     * @param classificacaoIndicativa recebe a classificação indicativa do filme por padrão
     * @param tempoDuracao recebe o tempo de duração do filme por padrão
     * @param categoria recebe a categoria do filme por padrão
     * @param preco recebe o preço do filme por padrão
     */
    public Filmes(String nomeDoFilme, String classificacaoIndicativa, int tempoDuracao, String categoria, double preco) {
        this.nomeDoFilme = nomeDoFilme;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.tempoDuracao = tempoDuracao;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return retorna o valor do tempo de duracao em horas. /60
     */
    public double calcularTempoDuracaoEmHoras() {
        return this.tempoDuracao / 60.0;
    }

    @Override
    public String toString() {
        return  "\nNome do filme: " + nomeDoFilme
              + "\nClassificação Indicativa: " + classificacaoIndicativa
              + "\nTempo de duração: " + tempoDuracao
              + "\nTempo de duração em horas: " + calcularTempoDuracaoEmHoras()
              + "\nCategoria: " + categoria
              + "\nPreço: " + preco;
    }
}
