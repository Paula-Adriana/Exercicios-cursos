Algoritmo "Funcionario"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/3/2020
Var
// Seção de Declarações das variáveis 
    Nome: caractere
    sal, Nsal: real
    dep: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreva ("Qual o nome do funcionário? ")
   Leia (Nome)
   Escreva ("Qual o salário do funcionário? R$ ")
   Leia (sal)
   Escreva ("Qual é a quantidade de dependentes? ")
   Leia (dep)
   Escolha dep
             Caso 0
                  Nsal <- sal + (5*sal/100)
             Caso 1,2,3
                  Nsal <- sal + (10*sal/100)
             Caso 4,5,6
                  Nsal <- sal + (15*sal/100)
             Outrocaso
                  Nsal <- sal + (18*sal/100)
   FimEscolha
   Escreval
   Escreval ("O novo salário de ", nome, " será de: R$ ", Nsal:5:2)
Fimalgoritmo