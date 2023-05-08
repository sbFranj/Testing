package boletin1eda.ej07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaTest {

	@Test
	void testAddCliente() {
		Caja prueba = new Caja();
		prueba.addCliente(new Cliente());
		prueba.addCliente(new Cliente());
		
		assert(prueba.numeroClientes()==2);
	}

	@Test
	void testremoveCliente() {
		Caja prueba = new Caja();
		Cliente uno = new Cliente();
		Cliente dos = new Cliente();
		prueba.addCliente(uno);
		prueba.addCliente(dos);
		
		assert(prueba.numeroClientes()==2);
		prueba.removeCliente(uno);
		assert(prueba.numeroClientes()==1);
	}

}
