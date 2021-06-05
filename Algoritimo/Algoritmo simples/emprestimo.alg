Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/3/2020
Var
   // Seção de Declarações das variáveis
      valor_emprestimo, J, parcela, VP, VT: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
      Escreva ("Digite o valor do empréstimo desejado: ")
      Leia (valor_emprestimo)
      Escreva ("Em quantas parcelas deseja pagar? ")
      Leia (parcela)
      J <- (valor_emprestimo * 20)/100
      VT <- J+valor_emprestimo
      VP <- VT/parcela
      Escreval ("O valor total do empréstimo será de: R$ ", VT:4:2, " reais")
      Escreval ("Parcelado em: R$ ", parcela, " vezes ")
      Escreval ("Sendo R$ ", vp:4:2, " o valor de cada parela ")
   

Fimalgoritmo