package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(retornoEsperado, circulo.getCor());        
    }
}
