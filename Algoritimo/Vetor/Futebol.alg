Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 9/4/2020
Var
   // Seção de Declarações das variáveis
   nome: vetor [1..3] de caractere
   time1: vetor [1..6] de caractere
   time2: vetor [1..6] de caractere
   N, i: inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval ("=======================")
   Escreval (" CAMPEONATO DE FUTEBOL ")
   Escreval ("=======================")
   Para N <- 1 ate 3 faca
      Escreva ("Nome do ", N, "o. time: ")
      Leia (nome[N])
   FimPara
   
    Para i <- 1 ate 1 faca

           time1[1] <- nome [1]
           time1[2] <- nome [1]
           time1[3] <- nome [2]
           time1[4] <- nome [2]
           time1[5] <- nome [3]
           time1[6] <- nome [3]


   FimPara

     Para i <- 1 ate 1 faca

           time2 [1] <- nome[2]
           time2 [2] <- nome[3]
           time2 [3] <- nome[1]
           time2 [4] <- nome[3]
           time2 [5] <- nome[1]
           time2 [6] <- nome[2]


   FimPara

   limpatela
   Escreval ("---------------------------")
   Escreval ("    TABELA DE PARTIDAS     ")
   ESCREVAL ("---------------------------")
   Para i <- 1 ate 6 faca
   Escreval (time1[i]:10, " [ ]   X   [ ] ", time2[i]:10)
   fimpara
Fimalgoritmo