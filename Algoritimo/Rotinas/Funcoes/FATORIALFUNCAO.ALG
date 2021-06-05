Algoritmo "FatorialFuncao"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 6/4/2020
Var
   // Seção de Declarações das variáveis
   N,F: inteiro

funcao Fatorial (V: inteiro): inteiro
var
   C,R: inteiro
Inicio
   R <- 1
   Para C <- 1 ate V  faca
      R <- R*C
   FimPara
   Retorne R
FimFuncao

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva ("Digite um numero: ")
   Leia (N)
   F <- Fatorial (N)
   Escreva ("O valor de ", N, "! é igual a ",F)

Fimalgoritmo