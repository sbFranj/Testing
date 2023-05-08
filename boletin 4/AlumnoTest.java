package boletin1eda.ej05;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testEnviarMensaje() {
		Persona p = new Profesor("Profesor", LocalDate.now().plusYears(-25));
		Persona a = new Alumno("Profesor", LocalDate.now().plusYears(-17));
		Persona a2 = new Alumno("Profesor", LocalDate.now().plusYears(-16));
		
		try {
			a.enviarMensaje(p, "hola profe");
		} catch (Exception e) {
			assert(false);
		}
		try {
			a.enviarMensaje(a2, "hola profe");
		} catch (Exception e) {
			assert(true);
		}
	}

	@Test
	void testRecibirMensaje() {
		Persona p = new Profesor("Profesor", LocalDate.now().plusYears(-25));
		Persona a = new Alumno("Profesor", LocalDate.now().plusYears(-17));
		Mensaje prueba = new Mensaje(p, "hola");
		assert(a.buzonVacio());
		a.recibirMensaje(prueba);
		assert(!a.buzonVacio());
	}
	
	

}
