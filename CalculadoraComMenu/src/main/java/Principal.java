import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        int opcao;

        System.out.println("\f");

        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" 1) Soma."
                    + "\n 2) Subtração."
                    + "\n 3) Divisão"
                    + "\n 4) Multiplição"
                    + "\n 5) Radiciação"
                    + "\n 6) Potenciação"
                    + "\n 0) Sair"
                    + "\n Digite uma das opções acima:");

            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o numero 1 desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Digite o numero 2 desejado: ");
                    calculadora.setNumero2(scanner.nextDouble());
                    System.out.println("Resultado da soma: " + calculadora.somar());
                    break;
                case 2:
                    System.out.println("Digite o numero 1 desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Digite o numero 2 desejado: ");
                    calculadora.setNumero2(scanner.nextDouble());
                    System.out.println("Resultado da Subtração: " + calculadora.subtrair());
                    break;
                case 3:
                    System.out.println("Digite o numero 1 desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Digite o numero 2 desejado: ");
                    calculadora.setNumero2(scanner.nextDouble());
                    System.out.println("Resultado da Divisão: " + calculadora.dividir());
                    break;
                case 4:
                    System.out.println("Digite o numero 1 desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Digite o numero 2 desejado: ");
                    calculadora.setNumero2(scanner.nextDouble());
                    System.out.println("Resultado da Multiplicação: " + calculadora.multiplicar());
                    break;
                case 5:
                    System.out.println("Digite o numero desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Resultado da Radiciação: " + calculadora.radiciar());
                    break;
                case 6:
                    System.out.println("Digite o numero 1 desejado: ");
                    calculadora.setNumero1(scanner.nextDouble());
                    System.out.println("Digite o numero que sera elevado: ");
                    calculadora.setPotencia(scanner.nextDouble());
                    System.out.println("Resultado da Potenciação: " + calculadora.potenciar());
                    break;
            }
        }while(opcao != 0);
    }
}
