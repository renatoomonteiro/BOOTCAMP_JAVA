programa
{
	/*
	Dada uma matriz A, com a capacidade para N linhas e M colunas, faça
	um algoritmo que zere todos os elementos desta matriz.

	*/
	funcao inicio()
{
	inteiro n, m, i, j

		//Solicitar ao usuário o número de linas e colunas

		escreva("Informe o número de linhas da matriz: ")
		leia(n)

		escreva("\nInforme o número de colunas da matriz: ")
		leia(m)

		limpa()

		escreva("\nQuantidade de linas informadas: ", n)
		escreva("\nQuantidade de colunas informadas: ", m)

		inteiro a[100][100]
		
		para(i=0; i<n; i++)
		{
			para(j=0; j<m; j++)
			{
				escreva("\nDigite o valor para a posição [", i, "][", j, "]: ")
				leia(a[i][j])
			}
		}

		escreva("Matriz preenchida:\n")

		para(i=0; i<n; i++)
		{
			para(j=0; j<m; j++)
			{
				escreva(a[i][j], " ")
			}
			escreva("\n")
		}

		// Zerando os elementos da matriz
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                a[i][j] = 0
            }
        }

        // Exibir a matriz após ser zerada
        escreva("\nMatriz após ser zerada:\n")
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                escreva(a[i][j], " ")
            }
            escreva("\n")
        }
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1073; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */