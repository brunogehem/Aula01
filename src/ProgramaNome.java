//Como queremos utilizar o Scanner para ler os dados que o usuário vai digitar, e ele não é carregado por padrão
import java.util.Scanner;

//Esse programa deve receber o nome do usuário e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados tipo String (textos)
		String nome; 
		System.out.println("Por favor, digite seu nome:");
		
		
		nome = leitor.next();
		
		//Para lermos textos com espaço podemos usar o nextLine:
		//nome + leitor.nextLine();
		
		//Esse código lê um texto do teclado do usuário
		System.out.println("Que legal que seu nome é " + nome);
		
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa");
		//Após terminar de usar o leitor, precisamos fechar
		leitor.close();
			}

}