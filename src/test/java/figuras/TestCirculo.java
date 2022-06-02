package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestCirculo {
    
    @Test    
    void testGetArea() {
        double lado = 5;
        double retornoEsperado = 78.53750000000001;
        Circulo circulo = new Circulo("", lado);
        double retornoFeito = circulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testCirculo() {
        Circulo circulo = new Circulo();
        assertTrue(("".equals(circulo.getCor()) && circulo.getRaio() == 0.0));
    }
}
