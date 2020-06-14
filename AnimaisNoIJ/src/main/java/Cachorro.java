public class Cachorro extends Animal{

    private String comportamento;
    private String planeta;
    private String nacionalidade;

    public Cachorro() {
        super();
    }

    public String getComportamento() {
        return this.comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getPlaneta() {
        return this.planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int calcularAnosDeVidaEmRelacaoUmHumano() {
        return this.idade * 7;
    }

    public String latir() {
        return "AU AU AU AU";
    }
    @Override
    public String toString() {
        return "\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nComportamento: " + this.comportamento
                + "\nPlaneta: " + this.planeta
                + "\nNacionalidade: " + this.nacionalidade
                + "\nAnos de vida em relação a um humano: " + this.calcularAnosDeVidaEmRelacaoUmHumano()
                + "\nSom: " + this.latir();
    }
}

