public class Gato extends Animal {
    private String pelagem;
    private String raca;
    private float estatura;

    public Gato() {
        super();
    }

    public String getPelagem() {
        return this.pelagem;
    }
    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public float getEstatura() {
        return this.estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    /*contar 15 anos para o primeiro ano de vida e 10 anos para o segundo ano de vida. Depois disso, adiciona se 4 anos para cada ano do gato*/
    public String mostrarIdadeEmRelacaoHumano() {
        if(this.idade == 1) {
            return "15 anos";
        } else if(this.idade == 2) {
            return "25 anos";
        } else if(this.idade == 3) {
            return "29 anos";
        } else if(this.idade == 4) {
            return "33 anos";
        } else if(this.idade == 5) {
            return "37 anos";
        } else if(this.idade == 6) {
            return "41 anos";
        } else if(this.idade == 7) {
            return "45 anos";
        } else if(this.idade == 8) {
            return "49 anos";
        } else if(this.idade == 9) {
            return "53 anos";
        } else if(this.idade == 10) {
            return "57 anos";
        } else if(this.idade == 11) {
            return "61 anos";
        } else if(this.idade == 12) {
            return "65 anos";
        } else if(this.idade == 13) {
            return "69 anos";
        } else if(this.idade == 14) {
            return "73 anos";
        } else if(this.idade == 15) {
            return "77 anos";
        } else if(this.idade == 16) {
            return "81 anos";
        }
        return "Deu RUIM!";
    }
    public String miar() {
        return "MEOW meow MeOw";
    }
    @Override
    public String toString() {
        return "\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nPelagem: " + this.pelagem
                + "\nRaça: " + this.raca
                + "\nEstatura(cm): " + this.estatura + "cm"
                + "\nIdade em relação a um humano: " + this.mostrarIdadeEmRelacaoHumano()
                + "\nSom: " + this.miar();
    }
}