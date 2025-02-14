programa
{
	
/*
Desafio_1_15JAN25
Uma loja do tipo “preço único” só possui produtos de 3 e 5 reais.
O menor valor de venda é de 8 reais. Dado que sempre é possível
compor qualquer quantia >= 8, apenas com produtos de 3 e 5 reais,
faça um algoritmo que mostre como pode ser feita uma compra de 
modo que seja adquirida a maior quantidade possível de produtos, 
e que não sobre troco.
*/
	funcao inicio()
	{
		inteiro prod3=0, prod5=0, valor

		escreva("Digite o valor que deseja comprar (acima de R$8): R$")
		leia(valor)

		enquanto(valor < 8)
		{
			escreva("Digite o valor que deseja comprar (acima de R$8): ")
			leia(valor)
		}

		prod3 = valor / 3

		se(valor % 3 == 1)
		{
			prod3 -= 3
			prod5 += 2
		}

		se(valor % 3 == 2)
		{
			prod3 -= 1
			prod5++
		}
		limpa()

		escreva("A maior quantidade possível de produtos para comprar com R$",valor, ",00 são: \n")		
		escreva("\n",prod3 ,  " produto(s) de R$3,00 \n", prod5 , " produto(s) de R$5,00\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 893; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */