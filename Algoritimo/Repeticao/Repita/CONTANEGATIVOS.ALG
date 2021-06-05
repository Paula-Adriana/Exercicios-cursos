Algoritmo "ContaNegativos"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/3/2020
Var
// Seção de Declarações das variáveis 
   N, C, TotN: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    C <- 1

    Repita
    Escreva ("Digite um número: ")
    Leia (N)
    Se (N < 0) entao
       totN <- TotN+1
    FimSe
    C <- C+1
    Ate (C > 5)
    Escreval
    Escreval ("Foram encontrados", TotN, " números negativos.")
Fimalgoritmo