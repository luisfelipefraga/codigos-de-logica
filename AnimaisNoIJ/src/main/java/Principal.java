public class Principal {
    public static void main(String args[]) {

        System.out.println("\f");

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Krypto";
        cachorro.idade = 9;
        cachorro.setComportamento("Sério");
        cachorro.setPlaneta("Krypton");
        cachorro.setNacionalidade("Kryptoniano");

        System.out.println(cachorro);

        Gato gato = new Gato();
        gato.nome = "Rivaldo";
        gato.idade = 6;
        gato.setPelagem("Branco");
        gato.setRaca("Persa");
        gato.setEstatura(20);
        System.out.println(gato);
    }
}
