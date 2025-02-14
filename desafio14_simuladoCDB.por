programa
{
	/*
	Dado um vetor V, com N números inteiros distintos, verificar se estão em ordem crescente
	*/
	funcao inicio()
	{
	inteiro v[10] = {10, 7, 8, 17, 60, 50, 3, 13, 2, 1}, i, j, aux

		//Exibe o vetor completo
		escreva("Este é o Vetor v, com dez posições de forma desordenada:\nv[10] = { ")
		para(i=0; i<10; i++)
		{
			escreva( v[i], " ")
		}
		escreva("}")
		escreva("\n")

		// Ordenação do vetor usando Bubble Sort
		para(i=0; i<10; i++)
		{
			para(j=0; j<9; j++)
			{
				se(v[j] > v[j + 1])
					{
						// Troca de valores
						aux = v[j]
						v[j] = v[j + 1]
						v[j + 1] = aux
					}
			 }
		}
		escreva("\nEste é o mesmo vetor v de forma ordenada:\nv[10] = {")
		para(i=0; i<10; i++)
		{
			escreva(v[i], " ")
		}
		escreva(" }")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 760; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */