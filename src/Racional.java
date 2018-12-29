
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
		
		int mdc = 1, auxA = a, auxB = b;
		
		for(int i = 2; (a > 1 && b > 1) && i < auxA || i < auxB; i++) {
			
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
	
	public static Racional somaRacional(Racional a, Racional b) {
		
		Racional resultado = new Racional();
		
		if(a.getDenominador() == b.getDenominador()) {
			
			resultado.setDenominador(a.getDenominador());
			resultado.setNumerador(a.getNumerador() + b.getNumerador());
			
		}else {
			
			resultado.setDenominador(a.getDenominador() * b.getDenominador());
			resultado.setNumerador((resultado.getDenominador() / a.getDenominador() * a.getNumerador()) + 
								   (resultado.getDenominador() / b.getDenominador() * b.getNumerador()));
			
		}
		
		resultado.setNumerador(resultado.getNumerador() / calculaMDC(resultado.getNumerador(), resultado.getDenominador()));
		resultado.setDenominador(resultado.getDenominador() / calculaMDC(resultado.getNumerador(), resultado.getDenominador()));
		
		return resultado;
	}
	
	
}
