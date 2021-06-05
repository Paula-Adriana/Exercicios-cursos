Algoritmo "TesteVetor"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/4/2020
Var
// Seção de Declarações das variáveis 
  v: vetor [1..6] de inteiro
  C: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    Para C <- 1 ate 6 faca
           Escreva ("Digite o ",c, "o. valor: ")
           Leia (v [c])
    FimPara
    
     Para C <- 1 ate 6 faca
           Escreva ("{", v[c], "}")

    FimPara

Fimalgoritmo