programa
{
/*
Programa 3: Maior e menor valor de um vetor
- Crie uma variável inteira tipo vetor de nome var_Num com dimensão de 08 elementos
- Preencha com valores quaisquer entre 0 a 100 (atribua, não use leia). Não repita os numeros.
- Imprima ao final o MAIOR e MENOR valor encontrado.
Ps: Nesse programa a sugestão é usar duas funções (que devem ser
chamadas na função INICIO) :
1 - MaiorMenor() - Com LOOP, fazer a leitura de todos os valores do vetor e
identificar o maior e menor.
2 - Finalizar() - Imprime o maior e menor valor encontrado
*/
	inteiro var_Num[8] = {2,40,27,13,45,50,79,99}, i, menor=var_Num[0], maior=var_Num[0]
	
	funcao inicio()
	{
	
	maiorMenor()
	finalizar()
	
}

	funcao maiorMenor()
	{
		para(i=0; i<=7; i++)
	{
		se(var_Num[i] > maior)
		{
			maior = var_Num[i]
		}
		se (var_Num[i] < menor)
		{
			menor = var_Num[i]
		}
		
		escreva("Número na posição ", i, "=", var_Num[i],"\n")
	}
	}

	funcao finalizar()
	{
		escreva("O maior número = ", maior,"\n")
		escreva("O menor número = ", menor)	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */