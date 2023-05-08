package boletin1eda.ej04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;



class HistorialTest {

	@Test
	void testNuevaConsulta() {
		Historial prueba = new Historial();
		assert(prueba.estaVacio());
		prueba.nuevaConsulta("marca");
		assert(!prueba.estaVacio());
	}

	@Test
	void testBorrarHistorial() {
		Historial prueba = new Historial();
		assert(prueba.estaVacio());
		prueba.nuevaConsulta("marca");
		prueba.borrarHistorial();
		assert(prueba.estaVacio());
	}
	
	@ParameterizedTest
	@MethodSource("proveedorUrls")
	void testNuevaConsulta(String url) {
		Historial prueba = new Historial();
		assert(prueba.estaVacio());
		prueba.nuevaConsulta(url);
		assert(!prueba.estaVacio());
	}
	
	static Stream<String> proveedorUrls() {
	    return Stream.of("www.marca.es", "www.elpais.es", "www.finofilipino.org");
	}
	
	

}
