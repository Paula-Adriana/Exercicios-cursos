Algoritmo "AnalisadorValores"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 2/4/2020
Var

 S, DV, NU, SP, N1, cont: inteiro
 M: real

Inicio
  Para cont <- 1 ate  5 faca
  Escreva ("Digite o ", cont, " número: ")
  Leia (N1)
  S <- S+N1
  M <- S/5
  Se (N1%5=0) entao
     DV <- Dv+1
  FimSe
  Se (N1=0) entao
     NU <- NU+1
  FimSe
  Se (N1%2=0) entao
  SP <- SP+N1
  FimSe
  FimPara
  Escreval ("A soma dos valores é: ", S)
  Escreval ("A média dos valores é: ", M)
  Escreval ("Os valores divisíveis por cinco foram: ", DV)
  Escreval ("Valores nulos foram: ", NU)
  Escreval ("A soma dos valores pares é: ", SP)
Fimalgoritmo