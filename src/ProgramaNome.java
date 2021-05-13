//Como queremos utilizar o Scanner para ler os dados que o usu�rio vai digitar, e ele n�o � carregado por padr�o
import java.util.Scanner;

//Esse programa deve receber o nome do usu�rio e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados tipo String (textos)
		String nome; 
		System.out.println("Por favor, digite seu nome:");
		
		
		nome = leitor.next();
		
		//Para lermos textos com espa�o podemos usar o nextLine:
		//nome + leitor.nextLine();
		
		//Esse c�digo l� um texto do teclado do usu�rio
		System.out.println("Que legal que seu nome � " + nome);
		
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa");
		//Ap�s terminar de usar o leitor, precisamos fechar
		leitor.close();
			}

}