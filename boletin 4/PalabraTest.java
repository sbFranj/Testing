package boletin1eda.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalabraTest {

	@Test
	void testAddSignificado() {
		Palabra uno = new Palabra("perro", "significado");
		uno.addSignificado("significado2");
		uno.addSignificado("significado3");
		String [] tmp = uno.mostrarSignificado().split("\n");
		assert(tmp.length==3);
		
	}

	@Test
	void testMostrarSignificado() {
		Palabra uno = new Palabra("perro", "significado");
		uno.addSignificado("significado2");
		String [] tmp = uno.mostrarSignificado().split("\n");
		assert(tmp.length==2);
		
	}

}
