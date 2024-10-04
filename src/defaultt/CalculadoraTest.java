package defaultt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
	int a;
	int b;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		a = 3;
		b = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    void testSumar() {
        int resultado = Calculadora.suma(a, b);
        assertEquals(6, resultado);
    }

    @Test
    void testRestar() {
        int resultado = Calculadora.resta(a, b);
        assertEquals(0, resultado);
    }

    @Test
    void testMultiplicar() {
        int resultado = Calculadora.multiplica(a, b);
        assertEquals(9, resultado);
    }

    @Test
    void testDividir() {
        int resultado = Calculadora.divide(a, b);
        assertEquals(1, resultado);
    }

    @Test
    void testDividirPorCero() {
    	b = 0;
        int resultado = Calculadora.divide(a, b);
        assertEquals(-1, resultado);
    }

}
