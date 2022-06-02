package figuras;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes da Figura")
class TestFigura {

    @DisplayName("Teste da cor da Figura")
    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura circulo = new Circulo();
        circulo.setCor("Verde");
        assertTrue(retornoEsperado.equals(circulo.getCor()));
    }
}
