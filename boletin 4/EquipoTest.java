package boletin1eda.ej08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	void testNumeroDeJugadoresMayoresDeEdad() {
		Alumno a1 = new Alumno("antonio", "ant", 19, 'H', "Sevilla");
		Alumno a2 = new Alumno("manue", "man", 17, 'H', "Malaga");
		Alumno a3 = new Alumno("rodolfo", "rod", 21, 'H', "Cordoba");
		Equipo a = new Equipo("A");
		try {
			a.addAlumno(a1);
			a.addAlumno(a2);
			a.addAlumno(a3);
		} catch (Exception e) {
		
		}
		assert(a.numeroDeJugadoresMayoresDeEdad()==2);
		
	}

	@Test
	void testExisteJugadoraMayorDeEdad() {
		Alumno a1 = new Alumno("antonia", "ant", 19, 'M', "Sevilla");
		Alumno a2 = new Alumno("manue", "man", 17, 'H', "Malaga");
		Equipo a = new Equipo("A");
		Equipo b = new Equipo("A");
		try {
			a.addAlumno(a1);
			b.addAlumno(a2);
			
		} catch (Exception e) {
		
		}
		assert(a.existeJugadoraMayorDeEdad());
		assert(!b.existeJugadoraMayorDeEdad());
	}

}
