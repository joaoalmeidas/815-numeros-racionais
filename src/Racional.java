
public class Racional {
	
	private int numerador;
	private int denominador;
	
	public Racional() {
		this(1, 1);
	}
	
	public Racional(int numerador, int denominador) {
		
		int numeradorAux = numerador, denominadorAux = denominador, mdc;
		
		mdc = calculaMDC(numeradorAux, denominadorAux);
		
		setNumerador(numerador/mdc);
		setDenominador(denominador/mdc);
		
	}
	
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public static int calculaMDC(int a, int b) {
		
		int mdc = 1;
		
		for(int i = 2; a != 1 && b != 1; i++) {
			
			while(a % i == 0 && b % i == 0) {
				
				if(a % i == 0 && b % i == 0) {
					
					mdc *= i;
					
				}
				
				if(a % i == 0) {
					a /= i;
				}
				
				if(b % i == 0) {
					b /= i;
				}
				
			}
			
		}
		
		return mdc;
		
	}
	
	
}
