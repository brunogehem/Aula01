//Como queremos utilizar o Scanner para ler os dados que o usu�rio vai digitar, e ele n�o � carregado por padr�o, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele

import java.util.Scanner;

//Essse programa deve receber o nome do usu�rio e exibir esse nome com mensagem de boas vindas
public class ProgramaNome {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A linha abaixo cria um leitor para lermos o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados tipo String (textos)
		String nome;
		
		System.out.println("Por Favor digite seu nome:");
		//a linha abaixo pega o texto digitado pelo usu�rio e guarda a vari�vel "nome"
		
		nome = leitor.nextLine();
		//Para lermos textos com espa�o podemos usar o Next Line:
		//nome = leitor.nextLine();
		
		
		//Esse c�diigo l� um texto do teclado do usu�rio
		System.out.println("Que legal que seu nome � " + nome);		
		 
		
		System.out.println(nome +  " fico feliz que voc� esteja usando meu programa");
		
		//Ap�s terminarmos de usar o leitor, precisamos fecahr
		leitor.close();
		
		
	}

}
