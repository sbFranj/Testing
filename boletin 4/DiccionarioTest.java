package boletin1eda.ej06conmapa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiccionarioTest {

	@Test
	void testAddPalabra() {
		Diccionario rae = new Diccionario();
		
		rae.addPalabra("Perro", "animal de compañia");
		rae.addPalabra("Perro", "Persona vaga");
		
		assertFalse(rae.buscarPalabra("Perro").isEmpty());

	}

	@Test
	void testBuscarPalabra() {
		Diccionario rae = new Diccionario();
		
		rae.addPalabra("Perro", "animal de compañia");
		rae.addPalabra("Perro", "Persona vaga");
		
		assert(rae.buscarPalabra("Perro").split(System.lineSeparator()).length==2);
	
	}

	@Test
	void testBorrarPalabra() {
		Diccionario rae = new Diccionario();
		
		rae.addPalabra("Perro", "animal de compañia");
		rae.addPalabra("Perro", "Persona vaga");
		assertFalse(rae.buscarPalabra("Perro").isEmpty());
		try {
			rae.borrarPalabra("Perro");
		} catch (Exception e) {
			assert(false);
		}
		
	}

	@Test
	void testListarPalabrasQueEmpiecenPor() {
		Diccionario rae = new Diccionario();
		
		rae.addPalabra("Perro", "animal de compañia");
		rae.addPalabra("Perro", "Persona vaga");
		assert(rae.listarPalabrasQueEmpiecenPor("Pe").split(System.lineSeparator()).length==1);
	}

}
