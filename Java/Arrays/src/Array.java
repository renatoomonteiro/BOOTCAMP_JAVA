import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Estrutura de Dados - ARRAY
		Scanner input = new Scanner(System.in);

		String aluno1, aluno2, aluno3, aluno4;

		String[] alunos = new String[4];
		int[] notas = { 5, 7, 8, 4, 9, 5, 6, 7, 2, 10, 15 };

//		Variável inicial, que será considerada a maior, por enquanto, até que haja uma maior
//		do que ela, para ser substituída.
		int maior = notas[0];
		
		//Percorrer o array para achar o maior valor
//		i<notas.length = menor que o tamanho do array
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > maior) {
				maior = notas[i];
			}
		}

//		Fazer como exercício
//		Ordenar (Crescente e decrescente)
//		Descobrir a média
//		Descobrir o maior
//		Descobrir o primeiro
//		Descobrir o último
		
		//Exibir o maior
		System.out.println(maior);
//Comentar várias linhas: selecionar, e ctrl+7 
//		alunos[0] = "José";
//		alunos[1] = "Maria";
//		alunos[2] = "João";
//		alunos[3] = "Pedro";

//		Percorrer um array para inserir as entradas:
		for (int i = 0; i < 4; i++) {

			alunos[i] = input.nextLine();
		}

//		Percorrer o array para exibir as entradas:
		for (int i = 0; i < 4; i++) {
			System.out.println(alunos[i]);
		}
	}

}
