/**
 * @author Luis Felipe Fraga
 * @version 1.0
 * @since 01/06/2020 - 9:58
 * @category Model
 */
public class Categoria {
    private String nome;
    private int idade;

    public Categoria() {
    }
    /**
     * @paran Recebe o nome da pessoa
     * @paran Recebe a idade da pessoa
     */
    public Categoria(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @return Retorna a categoria da pessoa em relação a sua idade
     */
    public String mostrarCategoria() {
        if(this.idade < 8 && this.idade > 0) {
            return "Não pode ser nadador, mínimo oito anos!";
        } else if(this.idade >= 8 && this.idade <= 10) {
            return "Infantil";
        } else if(this.idade >= 11 && this.idade <= 17) {
            return "Juvenil";
        } else if(this.idade >= 18) {
            return "Adulto";
        } else {
            return "Idade Invalida";
        }
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nCategoria: " +this.mostrarCategoria();
    }
}

