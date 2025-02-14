programa
{
	
	funcao inicio()
	{
		cadeia nomeEstado
		inteiro estado, produto
		real valor
		escreva("Escolha o estado onde reside: \n1)SP\n2)MG\n3)RJ\n")
		leia(estado)
		escreva("\nEscolha o produto:\n1)TV\n2)Geladeira\n3)Notebook\n")
		leia(produto)
		escreva("\nInforme o valor do produto escolhido: \nR$")
		leia(valor)

		escolha(produto){
			caso 1: escreva("\nProduto escolhido: TV")
			pare
			caso 2: escreva("\nProduto escolhido: Geladeira")
			pare
			caso 3: escreva("\nProduto escolhido: Notebook")
			pare
			caso contrario: escreva("\nEscolha um produto válido!")
			}
			
		escolha(estado)
			{
			caso 1: escreva("\nTerá um acréscimo de 10% no valor de R$" , valor ," devido o frete para SP, Totalizando: R$" , valor = (valor * 1.10))
			pare
			caso 2: escreva("\nTerá um acréscimo de 15% no valor de R$" , valor ," devido o frete para MG, Totalizando: R$" , valor = (valor * 1.15))
			pare
			caso 3: escreva("\nTerá um acréscimo de 20% no valor de R$" , valor ," devido o frete para RJ, Totalizando: R$", valor = (valor * 1.20))
			pare
			caso contrario: escreva("\nNão será possível entregar!\nPor favor, retire na loja!\nValor da compra: R$", valor)
			}
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */