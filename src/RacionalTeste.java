
public class RacionalTeste {

	public static void main(String[] args) {
		Racional soma1 = new Racional(90, 90);
		Racional soma2 = new Racional(3, 6);
		Racional resSoma = Racional.somaRacional(soma1, soma2);
		
		Racional subtracao1 = new Racional(29, 6);
		Racional subtracao2 = new Racional(30, 30);
		Racional resSubtracao = Racional.subtraiRacional(subtracao1, subtracao2);
		
		System.out.println("Soma entre fra��es:\n");
		
		System.out.printf("%d/%d + %d/%d = %d/%d", soma1.getNumerador(), soma1.getDenominador(), soma2.getNumerador(),
				soma2.getDenominador(), resSoma.getNumerador(), resSoma.getDenominador());
		
		System.out.println("\n\nSubtra��o entre fra��es:\n");
		
		System.out.printf("%d/%d + %d/%d = %d/%d", subtracao1.getNumerador(), subtracao1.getDenominador(), subtracao2.getNumerador(),
				subtracao2.getDenominador(), resSubtracao.getNumerador(), resSubtracao.getDenominador());
	}

}
