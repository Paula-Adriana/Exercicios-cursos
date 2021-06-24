Algoritmo "lerMatriz"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 7/7/2020
Var
// Seção de Declarações das variáveis
   mat: vetor [1..3, 1..2] de inteiro    {3 linhas e duas colunas}
   l,c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Para l <- 1 ate 3 faca
          Para c <- 1 ate 2 faca
              Escreva ("Digite um valor: ")
              Leia (mat[l,c])
          FimPara
   FimPara

Fimalgoritmo