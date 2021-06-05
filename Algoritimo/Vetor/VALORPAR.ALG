Algoritmo "ValorPar"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/4/2020
Var
   // Seção de Declarações das variáveis
   val: vetor [1..7] de inteiro
   i, totpar: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Para i <- 1 ate 7 faca
      EScreva ("Digite o ",i, "o. valor: ")
      Leia (val[i])
   FimPara

   Para i <- 1 ate 7 faca
      Se (val[i]%2 = 0) entao
       totpar <- totpar+1
        Escreval ("Valor PAR na posição ",i)
      FimSe
   FimPara
   Escreval ("O total de pares foi: ", totpar)
Fimalgoritmo