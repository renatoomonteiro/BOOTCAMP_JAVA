programa
{
/*
Programa 2: Obter os valores maiores que a média de um conjunto vetor
(agora usando funções)
Com base no programa 1, criar um novo usando funções:
- obter_Media (Obter e imprimir a média)
- valores_Maiores (Imprimir os valores do vetor maiores que a media)
- finalizar (Imprimir o total de elementos que forem MAIORES que a média )
Na função INICIO, fazer a chamada das funções obter_Media,
valores_Maiores e finalizar.
*/
	inteiro var_Num[5] = {5,40,27,13,45}, contador, somatoria=0, media, posicao, maiorMedia=0
	funcao inicio()
	{
	

	para(contador=0; contador<=4; contador++)
	{
		posicao = var_Num[contador]
		somatoria += var_Num[contador]
	}
	obter_Media()
	valores_Maiores()
	finalizar()
	}
	
	funcao obter_Media()
	{		
		media = somatoria / 5
		escreva("Média=", media, "\n")
	}
	
	funcao valores_Maiores()
	{
	para(contador=0; contador<=4; contador++)
	{
		se(var_Num[contador] > media)
		{
		escreva("Número ", var_Num[contador] , " é maior que a média\n")
		maiorMedia++
		}
	}
		
	}	
	
	funcao finalizar()
	{
	escreva("Total de elementos maiores que a média: ", maiorMedia)	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 996; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */