import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {
    Categoria categoria = new Categoria();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        categoria.setIdade(8);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testMostrarCategoriaInfantil() {
        assertEquals("Infantil",categoria.mostrarCategoria());
        categoria.setIdade(9);
        assertEquals("Infantil",categoria.mostrarCategoria());
        categoria.setIdade(10);
        assertEquals("Infantil",categoria.mostrarCategoria());
    }
}