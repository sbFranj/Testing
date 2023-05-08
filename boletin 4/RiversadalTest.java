package boletin1eda.ej01;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class RiversadalTest {

	@Test
	void riversadaTest() {
		Integer[] numeros = new Integer[5];
		
		numeros[0]=40;
		numeros[1]=50;
		numeros[2]=60;
		numeros[3]=70;
		numeros[4]=80;
		
		Integer [] soremun = riversada(numeros);
		
		assert(soremun[0]==numeros[numeros.length-1]);
		assertFalse(soremun[0]!=numeros[numeros.length-1]);
	}

	public static <T> T[] riversada ( T[] arrayOriginal) {
		T[] arrayRiverse = arrayOriginal.clone();
		
		for(int i=0; i<arrayOriginal.length; i++) {
			arrayRiverse[i]=arrayOriginal[arrayOriginal.length-1-i];
		}
		
		
		return arrayRiverse;
	}

}
