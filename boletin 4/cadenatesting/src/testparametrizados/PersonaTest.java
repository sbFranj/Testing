package testparametrizados;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PersonaTest {

	@ValueSource(ints = {18,20,30,50,60})
	@ParameterizedTest
	void testEsMayorEdad(int edad) {
		assert(new Persona(edad).esMayorEdad());
	}
	
	@ValueSource(ints = {17,16,15,14,13})
	@ParameterizedTest
	void testEsMenorEdad(int edad) {
		assertFalse(new Persona(edad).esMayorEdad());
	}
	
	@ValueSource(ints = {-1,-10,101,110,150})
	@ParameterizedTest
	void testLimitesEdad(int edad) {
		assert(new Persona(edad).getEdad()>100 || new Persona(edad).getEdad()<0);
	}

}
