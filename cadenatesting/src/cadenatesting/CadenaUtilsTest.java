package cadenatesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTest {
	
	CadenaUtils c = new CadenaUtils();

	@Test
	void testMayusculas() {
		assertEquals("AAE", c.toMayusculas("aae"));
	}
	
	@Test
	void testMinusculas() {
		assertEquals("aae", c.toMinusculas("aAe"));
	}
	
	@Test
	void estaEnMayus() {
		assertEquals(true, c.estaEnMayusculas("AAE"));
		assertEquals(false, c.estaEnMayusculas("eAE"));
	}
	@Test
	void estaEnMinus() {
		assertEquals(true, c.estaEnMinusculas("aae"));
		assertEquals(false, c.estaEnMinusculas("eAE"));
	}
	
	@Test
	void esNumeroCapicua() {
		assertEquals(true, c.esCapicua(121));
		assertEquals(false, c.esCapicua(1241));
	}
	
	@Test
	void esNumeroPalindromo() {
		assertEquals(true, c.esPalindromo("aerea"));
		assertEquals(false, c.esPalindromo("azucar"));
	}

	@Test
	void esNumeroDecimal() {
		assertEquals(true, c.esDecimal("12.1"));
		assertEquals(false, c.esDecimal("1241"));
	}
	
	@Test
	void esNumeroEntero() {
		assertEquals(false, c.esEntero("12.1"));
		assertEquals(true, c.esEntero("1241"));
	}
}
