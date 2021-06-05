Algoritmo "ParImpar"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 6/4/2020
Var
// Seção de Declarações das variáveis 
  N: inteiro
  R: caractere
  
  funcao ParOuImpar (V: inteiro):caractere
  Inicio
      Se (V%2=0) entao
         Retorne "PAR"
      Senao
           Retorne "IMPAR"
      FimSe
  FimFuncao
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    Escreva ("Digite um numero: ")
    leia (N)
    R <- ParOuImpar (N)
    //O resultado sera o R passando N como parametro.
    Escreva ("o numero ", N, " é uma valor ", R)

Fimalgoritmo