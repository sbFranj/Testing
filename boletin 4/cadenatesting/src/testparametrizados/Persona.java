package testparametrizados;

public class Persona {
	
	private int edad;
	
	public static final int MAYORIA_EDAD=18;
	
	public Persona(int edad) {
			this.edad=edad;
		
	}
	
	public boolean esMayorEdad() {
		return this.edad>=MAYORIA_EDAD;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	

}
