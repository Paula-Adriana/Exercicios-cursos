Algoritmo "lerMatriz"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 7/7/2020
Var
// Seção de Declarações das variáveis
   m: vetor [1..4, 1..4] de inteiro
   I,J: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Para I <- 1 ate 4 faca
          Para J <- 1 ate 4 faca
             Escreva ("Digite o valor da posição [", i, ",", j, "]: ")
             Leia (m[i,j])
             
          FimPara
   FimPara
     Escreval ("==========")
     Escreval ("  MATRIZ  ")
     Escreval ("==========")
     Para i <- 1 ate 4 faca
          Para j <- 1 ate 4 faca
               EScreva (m [i,j]:3)
          FimPara
          Escreval ()
   FimPara

Fimalgoritmo