programa
{
	/*
	Dado um vetor V, com 10 elementos inteiros, 
	obtenha a quantidade de elementos ímpares. {10, 7, 8, 7, 6, 5, 3, 3, 2, 1}
	*/
	funcao inicio()
	{
	inteiro v[10] = {10, 7, 8, 7, 6, 5, 3, 3, 2, 1}, i=0, impar=0

		//Exibe o vetor completo
		escreva("Vetor: v[10] = { ")
		para(i=0; i<10; i++)
		{
			escreva( v[i], " ")
		}
		escreva("}")
		escreva("\n")
		
		//Extrai os números ímpares e acumula na variável impar
		para(i=0; i<10; i++)
		{
			se(v[i] % 2 == 1)
			{	
				impar++
			}
		}		
		escreva("A quantidade de númeos ímpares no vetor é ", impar, "\n")
		//escreva("No vetor ", v[i] , "a quantidade de números ímpares é ", impar)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */