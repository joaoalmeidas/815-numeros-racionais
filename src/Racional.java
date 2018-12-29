
public class Racional {
	
	private int numerador;
	private int denominador;
	
	public Racional(int numerador, int denominador) {
		
		int maior, menor, mdc = 1;
		
		if(numerador > denominador) {
			
			maior = numerador;
			menor = denominador;		
			
		}else {
			
			maior = denominador;
			menor = numerador;
			
		}
			
		
		for(int i = 2; maior != 1 && menor != 1; i++) {
			
			
			
			while(maior % i == 0 && menor % i == 0) {
				
				if(maior % i == 0 && menor % i == 0) {
					
					mdc *= i;
					
				}
				
				if(maior % i == 0) {
					maior /= i;
				}
				
				if(menor % i == 0) {
					menor /= i;
				}
				
			}
			
		}
		
		
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
	
	
}
