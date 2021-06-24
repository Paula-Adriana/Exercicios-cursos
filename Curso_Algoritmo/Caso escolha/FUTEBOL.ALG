Algoritmo "FUTEBOL"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/3/2020
Var
   // Seção de Declarações das variáveis
   bangu, madu, dif: inteiro
   status: CARACTERE
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval ("---------------------")
   Escreval ("  BANGU X MADUREIRA  ")
   Escreval ("---------------------")
   escreval
   Escreva ("Quantos gols Bangu fez? ")
   Leia (bangu)
   Escreva ("Quantos gols Madureira fez? ")
   leia (madu)
   dif <- abs (bangu-madu)

    Escolha (dif)
          Caso 0
          status <- "EMPATE"
          Caso 1,2,3
          status <- "NORMAL"
          OutroCaso
          status <- "GOLEADA"

   FimEscolha

   Escreval ("---------------------")
   ESCREVAL ("  DIFERENÇA: ", DIF)
   Escreval ("  STATUS: ", status)
   Escreval ("---------------------")
Fimalgoritmo