import java.util.Scanner;

public class OlaMundo {
//Atalho para identação: Seleciona o código e utiliza as teclas ctrl+shift+f
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Qual é o seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Qual é sua idade?");
		idade = input.nextInt();
		
		System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " de idade");
	}// FIM DO ESCOPO DA FUNÇÃO INÍCIO
}// FIM DO ESCOPO DA CLASSE OLÁ MUNDO
