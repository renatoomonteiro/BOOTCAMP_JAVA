import java.util.Scanner;
public class PoQueMao_Prof_Denilson_com_Ordenacao {
/* Enunciado:
 * Desafio PoQueMao
 * 
 * Pô, que mão
Um novo jogo se tornou popular entre jovens de todas as idades recentemente:
o Pô, que mão. Trata-se de um jogo onde uma mão captura criaturas raras e
depois as força a lutarem umas contra as outras. Uma verdadeira barbárie.
Ainda assim, o jogo se tornou bastante popular. As criaturas são chamadas
de pô-que-mãos. No jogo, você pode dar doces para as pô-que-mãos, para que
elas fiquem mais fortes e evoluam. Como há poucos doces, nem sempre é
possível evoluir todas as pô-que-mãos que um jogador possui. Um jogador tem
exatamente 3 pô-que-mãos. Cada um deles necessita de uma quantidade de
doces para evoluir. Conhecendo-se a quantidade de doces disponíveis,
escreva um programa para determinar qual o maior número de pô-que-mãos
que podem evoluir.
Entrada:
A entrada é composta por quatro linhas, cada uma contendo um inteiro. A
primeira linha contém N, o número de doces disponíveis. A segunda linha
contém X, o número de doces necessários para a primeira pô-que-mão evoluir.
A próxima linha contém Y, o número de doces necessários para a segunda pô-
que-mão evoluir. A última linha contém Z, o número de doces necessários para
a terceira pô-que-mão evoluir.
Saída:
Seu programa deve produzir uma única linha, contendo um inteiro, o maior
número possível de pô-que-mãos que podem evoluir.
Restrições:
 0 ≤ N ≤ 1000
 1 ≤ X ≤ 1000
 1 ≤ Y ≤ 1000
 1 ≤ Z ≤ 1000
Exemplos
Entrada
300
220
100
190
Saída
2
Entrada
1000
100
200
300
Saída
3
 * 
 * */
	public static void main(String[] args) {
		//Solução do exercício conforme a orientação do professor Denilson
		//Utilizando o método da ordenação:
		//Método de entrada de dados
		
		Scanner input = new Scanner(System.in);
		
		//Declaração das Variáveis
		int N, X, Y, Z, aux, cont = 0;
		
		//Atribuição de valores
		System.out.println("Informe a quantidade de doces disponíveis: ");
		N = input.nextInt();
		System.out.println("Quantos doces o PôQueMão X comeu? ");
		X = input.nextInt();
		System.out.println("Quantos doces o PôQueMão Y comeu? ");
		Y = input.nextInt();
		System.out.println("Quantos doces o PôQueMão Z comeu? ");
		Z = input.nextInt();
		
		//Processamento: (Ordenar do menor para o maior)
		//Comparando as duas primeiras entradas
		if(X>Y) {
			aux=X;
			X=Y;
			Y=aux;
		}
		if(Y>Z) {
			aux=Y;
			Y=Z;
			Z=aux;
		}
		//Reposicionando o menor em primeiro lugar
		//Repetindo a primeira condiçional
		if(X>Y) {
			aux=X;
			X=Y;
			Y=aux;
		}

		//Após ordenar, verificar quantos PôQueMão poderão evoluir por meio de um contador:
				
		//Subtrair do valor total, a quantidade de doces consumidos
		N = N- X;
		if(N > 0) {
			cont++;
		}
		
		N = N - Y;
		if(N > 0) {
			cont++;
		}
		N = N - Z;
		if(N > 0) {
			cont++;
		}
		//Saída
		System.out.println("Será possível evoluir " + cont + " PôQueMão(s)");
		
	}

}
