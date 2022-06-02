package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestQuadrado {

    @Test
    void testGetArea() {
        double lado = 4;
        double retornoEsperado = 16.0;
        Quadrado quadrado = new Quadrado("", lado);
        double retornoFeito = quadrado.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testQuadrado() {
        Quadrado quadrado = new Quadrado();
        assertTrue(("".equals(quadrado.getCor()) && quadrado.getLado() == 0));
    }
}
