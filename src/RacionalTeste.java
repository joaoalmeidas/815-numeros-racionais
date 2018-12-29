
public class RacionalTeste {

	public static void main(String[] args) {
		Racional r = new Racional(5, 5);
		Racional r2 = new Racional(3, 6);
		Racional soma = Racional.somaRacional(r, r2);
		
		System.out.println(r.getNumerador());
		System.out.println(r.getDenominador());
		
		System.out.println(r2.getNumerador());
		System.out.println(r2.getDenominador());
		
		System.out.println(soma.getNumerador());
		System.out.println(soma.getDenominador());

	}

}
