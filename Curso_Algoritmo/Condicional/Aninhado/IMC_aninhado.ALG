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
    Se (IMC < 17) entao
       Escreval ("Muito abaixo do peso")
    senao
         Se (IMC >= 17) e (IMC <= 18.5) entao
            Escreval ("Abaixo do peso")
         senao
              Se (IMC >= 18.5) e (IMC <=25) entao
                 Escreval ("Peso ideal")
              Senao
                   Se (IMC >=25) e (IMC <= 30) entao
                      Escreval ("Sobrepeso")
                   senao
                        Se (IMC >= 30) e (IMC <=35) entao
                             Escreval ("Obesidade")
                        senao
                             Se (IMC >= 35) e (IMC <= 40) entao
                                  Escreval ("Obesidade severa")
                             senao
                                  Escreval("Obesidade mórbida")
                             FimSe
                        FimSe
                   FimSe
              FimSe
         FimSe
    FimSe

Fimalgoritmo