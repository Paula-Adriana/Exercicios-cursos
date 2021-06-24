Algoritmo "IMC"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/3/2020
Var
// Seção de Declarações das variáveis 
     altura, massa, IMC: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreva ("Qual é a sua altura (m): ")
   Leia (altura)
   Escreva ("Qual é a sua massa (kg):")
   Leia (massa)
   IMC <- massa / (altura ^ 2)
   Escreval ("Seu IMC é de: ", IMC:5:2)
   Se (IMC >= 18.5) e (IMC < 25) entao
      Escreva (" Você está no peso ideal.")
   Senao
        Escreva ("Você não está na sua faixa de peso ideal")
   FimSe

Fimalgoritmo