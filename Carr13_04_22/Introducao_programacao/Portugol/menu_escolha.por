//Função: Criando Menu Interativo
//Autor: Jackson Loredo
programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Painel  2 - Abrir Funções do Painel  3 - Abrir Bios do Painel  4 - Sair")
		inteiro menu = 0

		escreva("\n"+"Escolha uma opção, e digite o numero.")
		leia(menu)

		

		escolha (menu) 
		{
		
		caso 1: 
			escreva("Painel!")
			pare
		
		caso 2: 
			escreva("Funções!")
			pare

		caso 3: 
			escreva("Bios")
			pare
		

		caso 4: 
			escreva("Saindo!.....")
			pare

		caso contrario: 
		escreva ("Você deve escolher as opções corretamente acima.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */