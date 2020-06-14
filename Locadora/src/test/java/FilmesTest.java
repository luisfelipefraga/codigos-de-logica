import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luis Felipe Fraga
 * @since 07/06/2020 13:50
 * @version 1.0
 */
class FilmesTest {

    private Filmes filmes = new Filmes();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        filmes.setTempoDuracao(60);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * Primeiro teste com o tempo de duração de 60 minutos.
     * Segundo teste com o tempo de duração de 180 minutos.
     * Terceiro teste com o tempo de duração de 30 minutos.
     */
    @org.junit.jupiter.api.Test
    void testCalcularTempoDuracaoEmHoras() {
        assertEquals(1.0, filmes.calcularTempoDuracaoEmHoras());
        filmes.setTempoDuracao(180);
        assertEquals(3.0, filmes.calcularTempoDuracaoEmHoras());
        filmes.setTempoDuracao(30);
        assertEquals(0.5, filmes.calcularTempoDuracaoEmHoras());
    }
}