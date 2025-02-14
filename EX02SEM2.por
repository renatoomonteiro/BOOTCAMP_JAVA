programa
{
	
	funcao inicio()
	{
		real nota1, nota2, media

		escreva("Escreva a primeira nota\n")
		leia(nota1)
		escreva("Escreva a segunda nota\n")
		leia(nota2)
		
		media = (nota1 + nota2) / 2

		escreva("Média.. ", media,"\n")

/*----------Operadores Aritméticos-----------------
	== -> igual
	> -> maior
	< -> menor
	>= ->maior ou igual
	<= -> menor ou igual
*/

		se(media >= 7){
			escreva("Aluno Aprovado!")
			}
		senao{
			escreva("Aluno em recuperação!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */