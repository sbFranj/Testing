package boletin1eda.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	void testAddAlumno() {
		Alumno a1 = new Alumno("antonio", "ant");
		Equipo a = new Equipo("A");
		try {
			a.addAlumno(a1);
		} catch (Exception e) {
			assert(false);
		}
	}

	@Test
	void testRemoveAlumno() {
		Alumno a1 = new Alumno("antonio", "ant");
		Equipo a = new Equipo("A");
		
		try {
			a.addAlumno(a1);
			a.removeAlumno(a1);
		} catch (Exception e) {
			assert(false);
		}
	}

}
