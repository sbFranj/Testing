package cadenatesting;

public class CadenaUtils {
	
	private String cadena;
	
	public CadenaUtils() {
		
	}
	
	public CadenaUtils(String cadena) {
		this.cadena=cadena;
	}
	
	public String toMayusculas(String cadena) {
		
		return cadena.toUpperCase();
	}

	public String toMinusculas(String cadena) {
		
		return cadena.toLowerCase();
	}
	
	public boolean estaEnMayusculas(String cadena) {
		boolean estaEnMayusculas=true;
		
		for(int i=0; i<cadena.length()-1; i++) {
			if(Character.isLowerCase(cadena.charAt(i))) {
				estaEnMayusculas=false;
			}
		}
		
		return estaEnMayusculas;
	}
	
	public boolean estaEnMinusculas(String cadena) {
		boolean estaEnMinusculas=true;
		
		for(int i=0; i<cadena.length()-1; i++) {
			if(Character.isUpperCase(cadena.charAt(i))) {
				estaEnMinusculas=false;
			}
		}
		
		return estaEnMinusculas;
	}
	
	public boolean esCapicua(int numero) {
		boolean esCapicua=true;
		String tmp=String.valueOf(numero);
		for(int i=0; i<tmp.length()-1;i++) {
			if(tmp.charAt(i)!=tmp.charAt(tmp.length()-i-1)) {
				esCapicua=false;
			}
		}
		
		return esCapicua;
	}
	
	public boolean esPalindromo(String cadena) {
		boolean esPalindromo=true;
		
		for(int i=0; i<cadena.length()-1;i++) {
			if(cadena.charAt(i)!=cadena.charAt(cadena.length()-i-1)) {
				esPalindromo=false;
			}
		}
		
		return esPalindromo;
	}
	
	public boolean esDecimal(String numero) {
		boolean esDecimal=false;
		
		if(numero.contains(".") || numero.contains(",")) {
			esDecimal=true;
		}
		
		return esDecimal;
	}
	
	public boolean esEntero(String numero) {
		boolean esEntero=true;
		
		if(numero.contains(".") || numero.contains(",")) {
			esEntero=false;
		}
		
		return esEntero;
	}
	
	
	
	
	
	
	
	
	
	
	
}
