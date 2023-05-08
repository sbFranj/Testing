package mockexamcolecciones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CombinacionTest {
	

	@CsvSource({"1,2,3,4,5,6,7,5",
				"1,2,3,4,20,6,7,4",
				"4,2,8,20,5,2,7,0"
	})
	@ParameterizedTest
	void testNumeroDeNumerosConsecutivos(int n1, int n2, int n3, int n4, int n5, int e1, int e2, int resultado) {
		try {
			Combinacion uno = new Combinacion(n1, n2, n3, n4, n5,e1,e2);
			
			assert(uno.numeroDeNumerosConsecutivos()==resultado);
		} catch (CombinacionException e) {
			assert(false);
		}
		
	}
	
	@CsvSource({"1,2,3,4,5,6,7, 1,2,3,4,5,6,7, 7",
				"1,2,3,4,20,6,7, 1,2,3,4,5,6,7, 6",
				"1,2,3,20,5,6,7, 12,14,13,22,15,10,1, 0"
	})
	@ParameterizedTest
	void testComprobarCombinacion(int n1, int n2, int n3, int n4, int n5, int e1, int e2,
								  int n11, int n22, int n33, int n44, int n55, int e11, int e22, int resultado) {
	try {
		Combinacion uno = new Combinacion(n1, n2, n3, n4, n5,e1,e2);
		Combinacion dos = new Combinacion(n11, n22, n33, n44, n55, e11, e22);
		
		assert(uno.comprobarCombinacion(dos)==resultado);
		
		
	} catch (CombinacionException e) {
		assert(false);
	}
	
	}

	
	@CsvFileSource(files="./files/secuenciaconsecutivos.csv")
	@ParameterizedTest
	void testNumeroDeNumerosConsecutivos2(int n1, int n2, int n3, int n4, int n5, int e1, int e2, int resultado) {
	try {
		Combinacion uno = new Combinacion(n1, n2, n3, n4, n5,e1,e2);
		
		assert(uno.numeroDeNumerosConsecutivos()==resultado);
	} catch (CombinacionException e) {
		assert(false);
	}
	
	}
	
	@CsvFileSource(files="./files/secuenciacomprobar.csv")
	@ParameterizedTest
	void testComprobarCombinacion2(int n1, int n2, int n3, int n4, int n5, int e1, int e2,
							  int n11, int n22, int n33, int n44, int n55, int e11, int e22, int resultado) {
	try {
	Combinacion uno = new Combinacion(n1, n2, n3, n4, n5,e1,e2);
	Combinacion dos = new Combinacion(n11, n22, n33, n44, n55, e11, e22);
	
	assert(uno.comprobarCombinacion(dos)==resultado);
	
	
	} catch (CombinacionException e) {
	assert(false);
	}
	
	}
	
	



}
