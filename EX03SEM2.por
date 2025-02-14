programa
{
	
	funcao inicio()
	{
		real nota1, nota2, media
		cadeia nome

		escreva("Escreva o nome do aluno\n")
		leia(nome)
		escreva("Escreva a primeira nota\n")
		leia(nota1)
		escreva("Escreva a segunda nota\n")
		leia(nota2)
		
		media = (nota1 + nota2) / 2

		escreva("\nNome: ", nome, 
			   "\nPrimeira nota: " , nota1 ,  
			   "\nSegunda nota: " , nota2 ,  
			   "\nMédia.. ", media,"\n")
		se(media >= 7){
			escreva("\nAluno Aprovado!")
			}
		senao se(media >= 2 e media <7){
			escreva("\nAluno em recuperação!")
			}
		senao{
			escreva("\nAluno reprovado!")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */