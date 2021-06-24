Algoritmo "QauntosEntre0e10"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/4/2020
Var
   // Seção de Declarações das variáveis
   C, V, tot, SI: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Para C <- 1 ate 6 faca
      Escreva ("Digite um valor: ")
      Leia (V)
      Se (V >=0) e (V<=10) entao
         tot <- tot+1

      FimSe
      Se (V%2=1) entao
            SI <- Si+V
         FimSe //aqui soma todos os impares, se jogasse dentro do se somava só do intervalo
   FimPara
      Escreval ("Ao todo foram ", tot, " valores entre 0 e 10.")
      Escreval ("Nesse intervalo, a soma de ímpares foi ", SI)
Fimalgoritmo