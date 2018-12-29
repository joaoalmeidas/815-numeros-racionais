
public class RacionalTeste {

	public static void main(String[] args) {
		Racional soma1 = new Racional(90, 90);
		Racional soma2 = new Racional(3, 6);
		Racional resSoma = Racional.somaRacional(soma1, soma2);
		
		Racional subtracao1 = new Racional(29, 6);
		Racional subtracao2 = new Racional(30, 30);
		Racional resSubtracao = Racional.subtraiRacional(subtracao1, subtracao2);
		
		Racional mult1 = new Racional(90, 6);
		Racional mult2 = new Racional(10, 6);
		Racional resMult = Racional.multiplicaRacional(mult1, mult2);
		
		Racional div1 = new Racional(9, 2);
		Racional div2 = new Racional(7, 3);
		Racional resDiv = Racional.divideRacional(div1, div2);
		
		System.out.println("Soma entre frações:\n");
		
		System.out.printf("%d/%d + %d/%d = %d/%d", soma1.getNumerador(), soma1.getDenominador(), soma2.getNumerador(),
				soma2.getDenominador(), resSoma.getNumerador(), resSoma.getDenominador());
		
		System.out.println("\n\nSubtração entre frações:\n");
		
		System.out.printf("%d/%d - %d/%d = %d/%d", subtracao1.getNumerador(), subtracao1.getDenominador(), subtracao2.getNumerador(),
				subtracao2.getDenominador(), resSubtracao.getNumerador(), resSubtracao.getDenominador());
		
		System.out.println("\n\nMultiplicação entre frações:\n");
		
		System.out.printf("%d/%d * %d/%d = %d/%d", mult1.getNumerador(), mult1.getDenominador(), mult2.getNumerador(),
				mult2.getDenominador(), resMult.getNumerador(), resMult.getDenominador());
		
		System.out.println("\n\nDivisão entre frações:\n");
		
		System.out.printf("%d/%d * %d/%d = %d/%d", div1.getNumerador(), div1.getDenominador(), div2.getNumerador(),
				div2.getDenominador(), resDiv.getNumerador(), resDiv.getDenominador());
	}

}
