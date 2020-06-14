public class Animal {
    protected String nome;
    protected byte idade;


    @Override
    public String toString() {
        return "Nome: " + this.nome
                + "Idade: " + this.idade;
    }
}
