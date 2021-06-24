Algoritmo "ConteAte10"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/3/2020
Var
// Seção de Declarações das variáveis 
   valor, salto, contador: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   contador <- 0
   Escreva ("Quer contar até quanto? ")
   Leia (valor)
   Escreva ("Qual será o intervalo? ")
   leia (salto)
   Enquanto (contador <= valor) faca
            Escreval (contador)
            contador <- contador + salto
   FimEnquanto
   Escreval ("Terminei de contar!")
Fimalgoritmo