public class Calculadora implements CalculadoraInterface {
    private double numero1;
    private double numero2;
    private double potencia;

    public double getNumero1() {
        return this.numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return this.numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double getPotencia() {
        return this.potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    @Override
    public double somar(){
        return this.numero1 + this.numero2;
    }
    @Override
    public double subtrair(){
        return this.numero1 - this.numero2;
    }
    @Override
    public double dividir(){
        return this.numero1 / this.numero2;
    }
    @Override
    public double multiplicar(){
        return this.numero1 * this.numero2;
    }
    public double radiciar() {
        return Math.sqrt(this.numero1);
    }
    public double potenciar() {
        return Math.pow(this.numero1,this.potencia);
    }
    public String toString(){
        return //"Soma: " + somar()
                "\n Subtração: " + subtrair()
                        +"\n Divisão: " + dividir()
                        +"\n Multiplição: " + multiplicar();
    }
}