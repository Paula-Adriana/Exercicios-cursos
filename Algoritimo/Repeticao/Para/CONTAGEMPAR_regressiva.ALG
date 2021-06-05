Algoritmo "ContagemPar"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/4/2020
Var
// Seção de Declarações das variáveis 
   Cont, V: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  Escreva ("Digite um valor: ")
  leia (v)
  Se (V%2=1) entao
     V <- V-1
  FimSE
  Para cont <- V ate 0 passo -2 faca
      Escreva (Cont, "...")
  FimPara

Fimalgoritmo