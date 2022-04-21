/*
Desafio

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Entrada

O arquivo de entrada contém um valor inteiro.
Saída

Imprima a saída conforme exemplo fornecido.
 
Exemplo de Entrada 	Exemplo de Saída

400
	

1 ano(s)
1 mes(es)
5 dia(s)

800
	

2 ano(s)
2 mes(es)
10 dia(s)

30
	

0 ano(s)
1 mes(es)
0 dia(s)


Tema

Fonte

Tab

Autocompletar

Snippets

TESTES
Teste #1

Teste #2

Teste #3

Teste #4

Teste #5

Teste #6

Teste #7

Teste #8

Dúvidas ?
Participe e converse com milhares de devs em nossa comunidade no Discord.
*/

// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalDeDias = parseInt(400);

let qtdAnos, qtdMeses;

qtdAnos = parseInt(totalDeDias / 365);


qtdMeses= parseInt((totalDeDias % 365) / 30);

totalDeDias = ((totalDeDias % 365) % 30);


let resultado = (qtdAnos + " ano(s) " + '\n' + 
qtdMeses +" mes(es)" + '\n' +
totalDeDias + " dia(s)");



//print(resultado);

console.log(resultado)