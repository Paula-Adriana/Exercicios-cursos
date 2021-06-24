Algoritmo "CriancaEsperança"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/3/2020
Var
// Seção de Declarações das variáveis 
   D, valor: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreval ("----------------------------")
   Escreval ("     CRIANÇA ESPERANÇA      ")
   Escreval ("----------------------------")
   Escreval (" Muito obrigado por ajudar  ")
   Escreval ("[1] para doar R$ 10.00")
   Escreval ("[2] para doar R$ 25.00")
   Escreval ("[3] para doar R$ 50.00")
   Escreval ("[4] para doar outros vaores")
   Escreval ("[5] para cancelar")
   Leia (D)
   Escolha D
          Caso 1
               valor <- 10
          Caso 2
               valor <- 25
          Caso 3
                valor <- 50
          Caso 4
                Escreva ("Qual o valor da doação? R$ ")
                Leia (valor)
          Caso 5
               valor <- 0
   FimEscolha
   Escreval ("----------------------------")
   Escreval ("Sua doação foi de R$ ", valor)
   Escreval ("Muito obrigado!")
   Escreval ("----------------------------")

Fimalgoritmo