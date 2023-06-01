
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		double idade = 37;
		
		double divisao = 3.14 / 2;
				
				System.out.println(divisao);
				
		int outraDivisao = 5 / 2; // int só recebe numeros inteiros ******** double recebe numeros reais
		
			System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2; // Divisão de numeros inteiros (mesmo com double) resulta em numero interio
		
			System.out.println(novaTentativa);
			
		double novaTentativaNovamente = 5.0 / 2; // Basta um numero real (nesse caso, o numero ser acompanhado por "." e outro numeral) para o resultado ser correto
		
			System.out.println(novaTentativaNovamente);
			
		double tentativaDois = -4.2 / 2; // Outro exemplo
		
			System.out.println(tentativaDois);
			
	}
}
