//Como queremos utilizar o Scanner para ler os dados que o usuário vai digitar, e ele não é carregado por padrão, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele

import java.util.Scanner;

//Essse programa deve receber o nome do usuário e exibir esse nome com mensagem de boas vindas
public class ProgramaNome {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A linha abaixo cria um leitor para lermos o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados tipo String (textos)
		String nome;
		
		System.out.println("Por Favor digite seu nome:");
		//a linha abaixo pega o texto digitado pelo usuário e guarda a variável "nome"
		
		nome = leitor.nextLine();
		//Para lermos textos com espaço podemos usar o Next Line:
		//nome = leitor.nextLine();
		
		
		//Esse códiigo lê um texto do teclado do usuário
		System.out.println("Que legal que seu nome é " + nome);		
		 
		
		System.out.println(nome +  " fico feliz que você esteja usando meu programa");
		
		//Após terminarmos de usar o leitor, precisamos fecahr
		leitor.close();
		
		
	}

}
