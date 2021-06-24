	Algoritmo "NumeroPrimo"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/3/2020
Var
   // Seção de Declarações das variáveis
   C, N, contdiv: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   C <-1
   contdiv <- 0
   Escreva ("Digite um numero: ")
   leia (N)
   Repita
      Se (N % C =0) entao
         contdiv <- contdiv+1
      FimSe
      C <- c+1
   Ate (C>N)
   Se (contdiv > 2) entao
      Escreval ("O valor ", N, " não é primo!")
   senao
      Escreval ("O valor ", N, " é primo!")
   FimSe
Fimalgoritmo