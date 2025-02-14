programa
{
    /*
    Dada uma matriz A, com a capacidade para N linhas e M colunas,
    faça um algoritmo que zere todos os elementos desta matriz.
    */

    funcao inicio()
    {
        inteiro n, m, i, j

        // Solicitar ao usuário o número de linhas e colunas
        escreva("Informe o número de linhas da matriz: ")
        leia(n)

        escreva("Informe o número de colunas da matriz: ")
        leia(m)

        // Exibir as dimensões da matriz
        escreva("\nQuantidade de linhas informadas: ", n)
        escreva("\nQuantidade de colunas informadas: ", m, "\n")

        // Criar a matriz como um vetor de vetores
        inteiro matriz[100][100] // Tamanho fixo grande suficiente

        // Preenchendo a matriz com valores informados pelo usuário
        escreva("Preencha os valores da matriz:\n")
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                escreva("Digite o valor para a posição [", i, "][", j, "]: ")
                leia(matriz[i][j])
            }
        }

        // Exibir a matriz preenchida
        escreva("\nMatriz preenchida:\n")
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                escreva(matriz[i][j], " ")
            }
            escreva("\n")
        }

        // Zerando os elementos da matriz
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                matriz[i][j] = 0
            }
        }

        // Exibir a matriz após ser zerada
        escreva("\nMatriz após ser zerada:\n")
        para (i = 0; i < n; i++)
        {
            para (j = 0; j < m; j++)
            {
                escreva(matriz[i][j], " ")
            }
            escreva("\n")
        }
    }    
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */