Algoritmo "SOMADOR"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/3/2020
Var
   // Seção de Declarações das variáveis
   N, S: inteiro
   resp: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Repita
      Escreva ("Digite um valor ==> ")
      leia (N)
      S <- S+N
      Escreva ("Voce quer continuar? [S/N] ")
      leia (resp)
   Ate (resp = "N")
      

   Escreval
   Escreval ("A soma de todos os valor foi: ", S)

Fimalgoritmo