package Util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompruebaParTest {

	//en este primero da verde y funciona. 
	@Test
	void testCompruebaNumero() {
		
		String resultadoReal= CompruebaPar.compruebaNumero(2);
		
		String resultadoBueno = "es par";
		
		assertEquals( resultadoBueno,resultadoReal);
	}

	//en este segundo da rojo y dice que esperaba un ess par, pero obtuvo un es par
	@Test
	void testCompruebaNumero1() {
		
		String resultadoReal= CompruebaPar.compruebaNumero(2);
		
		String resultadoBueno = "ess par";
		
		assertEquals( resultadoBueno,resultadoReal);
	}
}
