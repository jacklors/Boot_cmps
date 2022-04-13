//Função do Algoritmo: Calcular Média aritmética
//Autor: Jackson Loredo
programa
{
	
	funcao inicio()
	{
	     real in,nota1,nota2,nota3,nota4,media
	     cadeia aluno
		escreva("Olá Mundo, Seja Bem Vindo!")

		escreva("Digite seu nome: ")
		leia(aluno)
		
		escreva("Informe sua 1° nota: ")
		leia(nota1)
		escreva("Informe sua 2° nota: ")
		leia(nota2)
		escreva("Informe sua 3° nota: ")
		leia(nota3)
		escreva("Informe sua 4° nota: ")
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4

		escreva (aluno+" sua média é: " + media)
	
		//Verifica se a média é maior ou igual a 7
		se (media >= 7){
			escreva("\n"+"Parabéns você foi aprovado.")
		}
   			//Caso seja menor que 7
			senao {
				escreva ("\n"+ "Infelizmnte sua nota está abaixo da média, reprovado!")
		
			}
			
		}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */