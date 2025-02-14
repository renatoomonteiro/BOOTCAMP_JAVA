programa
{
	/*
	Dado um vetor V com "N" números inteiros distintos, verificar se estão
	em ordem crescente.
	*/
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		inteiro v[10], i, j, maior=0

		// preenche o vetor
		para(i=0; i<10;i++)
		{
			v[i] = util.sorteia(1, 99) // Sorteia um número e atribui à posição do vetor
		}

		escreva ("Vetor na ordem original:\n")
		
		para(i=0; i<10; i++)
		{
			escreva (v[i], " ")
		}
		
		// Exibe o vetor na ordem crescente
		escreva ("\n\nVetor na ordem crescente:\n")
		para(i=0; i<10; i++)
		{
			para(j=0; j<9; j++)
			{
				se(v[j] > v[j+1])
				{
					maior = v[j]
					v[j] = v[j+1]
					v[j+1] = maior
				}	
			}			
		}
		para(i=0; i<10; i++)
		{
			escreva(v[i], " ")	
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */