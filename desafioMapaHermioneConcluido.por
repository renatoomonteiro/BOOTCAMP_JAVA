programa
{
	funcao inicio()
	{
		inteiro i, j, inicio_i = -1, inicio_j = -1, final_i = -1, final_j = -1
		/*
		Criei uma matriz exatamente igual ao exemplo, 
		para não haver a necessidade de solicitar ao usuáro
		*/
		cadeia mapa[6][7] = { {".",".",".","H","H","H","."}, 
						  {"h","h","h",".",".",".","H"},
						  {"h",".","h","h","h",".","."},
						  {"h",".",".",".","h","h","."},
						  {"h",".","o",".",".",".","."},
						  {"h","h","h",".",".","H","H"}}
		/*
		Criei o primeiro laço de repetição para buscar o ponto inicial, representado pela letra "o"
		*/
		para(i=0;i<6;i++)
		{	
			para(j=0;j<7;j++)
			{
				se(mapa[i][j] == "o")
				{
					escreva("A posição inicial de Hermione no mapa é (", i , ",", j,")\n")
				}
			}			
		}

		/*
		Criei o segundo laço de repetição para buscar o caracteres de trajeto, representados pela 
		letra "h" e o ponto final ".", logo após o "h", na horizontal ou vertical, para considerar 
		como o fim do trajeto. 
		Também tratei nesta mesma condicional, o caracter anterior ao "h", como sendo outro "h", 
		o que indicaria um trajeto na horizontal ou vertical, e um após este "h", um ponto 
		final ".", na horizontal ou vertical, para indicar o final do trajeto.
		*/
		para(i=0;i<6;i++)
		{	
			para(j=0;j<7;j++)
			{	
				se(mapa[i][j] == "h" e 
				j+1 < 7 e 
				i+1 < 6 e 
				mapa[i+1][j] == "." e
				mapa[i][j+1] == "." e
				i-1 >= 0  e 
				j-1 >= 0  e 
				mapa[i-1][j] == "." e
				mapa[i][j-1] == "h" 				
				)
				{
					escreva("A posição final de Hermione no mapa é (", i , ",", j,")\n")
				}
			}
		}
		/*
		Com essa lógica pronta, posso fazer uma nova versão do exercício modularizada em funções
		*/		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */