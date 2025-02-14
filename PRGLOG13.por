programa
{
	inclua biblioteca Arquivos --> arq
	
	funcao inicio()
	{	
		cadeia caminho = ("C:/Users/RENATO/Documents/BOOTCAMP_JAVA/funcionarios.txt"), linha
		inteiro func = arq.abrir_arquivo(caminho, arq.MODO_LEITURA)
		
		linha = arq.ler_linha(func)
		escreva(linha)
		escreva("\n")
		linha = arq.ler_linha(func)
		escreva(linha)
		
		
		arq.fechar_arquivo(func)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */