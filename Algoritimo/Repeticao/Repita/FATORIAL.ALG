Algoritmo "Fatorial"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/3/2020
Var
// Seção de Declarações das variáveis 
  C, N, F: inteiro
  R : caractere
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  Repita
    Escreva ("Digite um número: ")
    leia (N)
    C <- N
    F <- 1
    Repita
    F <- F*C
    C <- C-1
    Ate (C <1)
    Escreval
    Escreva ("O valor do fatorial de", N, " é igual a ", F)
    Escreval
    Escreva ("Quer continuar? [S/N]")
    Leia (R)
    LimpaTela
  Ate (R = "N")
Fimalgoritmo