Algoritmo "semnome"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/3/2020
Var
// Seção de Declarações das variáveis 
     preco, imposto: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
      Escreva ("Qual o preço do produto? US$ ")
      leia (preco)
      imposto <- (preco*60)/100
      Escreva ("O imposto será de US$ ", imposto:5:2)
      //explicacao: 5 casas ao total, 2 depois da virgula//
Fimalgoritmo