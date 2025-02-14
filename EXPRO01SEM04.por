programa
{
/*
Programa 1 : Obter os valores maiores que a média de um conjunto vetor
- Crie uma variável inteira tipo vetor de nome var_Num com dimensão de 05 elementos
- Preencha com valores quaisquer entre 0 a 100 (atribua, não use leia).
- Em uma variavel tipo inteiro acumular usando um loop a soma dos itens do vetor e na
mesma variavel dividir por 5 para gerar a média) . Imprima a média obtida.
- Usando um LOOP , percorra TODOS os itens da var_Num, compare com a média e se for
maior, imprima.
- Imprima a quantidade de valores que entraram na condição acima.
*/
	
	funcao inicio()
	{
	inteiro var_Num[5] = {5,40,27,13,45}, contador, somatoria=0, media, posicao, maiorMedia=0

	para(contador=0; contador<=4; contador++)
	{
		posicao = var_Num[contador]
		somatoria += var_Num[contador]
	}
	
	media = somatoria / 5
	escreva("Média=", media, "\n")
	
	para(contador=0; contador<=4; contador++)
	{
		se(var_Num[contador] > media)
		{
		escreva("Número ", var_Num[contador] , " é maior que a média\n")
		maiorMedia++
		}
	}
	escreva("Total de elementos maiores que a média: ", maiorMedia)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1028; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */