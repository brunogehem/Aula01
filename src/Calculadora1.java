import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Criando uma vari�vel capaz de armazenar valors num�ricos com casas decimais
		double valor1;
		double valor2;	
		double soma, subtracao, divisao, multiplicacao;
		
		
		
		
		System.out.println("Por favor, digite primeiro valor");
		
		valor1 = leitor.nextDouble();
		
		System.out.println("Por Favor, digite o segundo valor");
		
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		divisao = valor1 / valor2;
		multiplicacao = valor1 * valor2;
		
		System.out.println("A soma entre os dois valores � " + soma);
		System.out.println("A subtracao entre os dois valores � " + subtracao);
		System.out.println("A divisao entre os dois valores � " + divisao);
		System.out.println("A multiplica��o entre os dois valores � " + multiplicacao);
		
		leitor.close();
	}

}
