Algoritmo "Melhor_aluno"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/3/2020
Var
   // Seção de Declarações das variáveis
   T, cont: inteiro
   Nome, A : caractere
   N, maior: real
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval ("------------------------")
   Escreval (" Escola Santa Paciência ")
   Escreval ("------------------------")
   Escreval
   Escreva ("Quantos alunos a turma tem? ")
   leia (T)
   Escreval ("------------------------")
   cont <- 1
   Enquanto (T >= 1) faca
      Escreva ("Aluno", cont, ": " )
      Leia (nome)
      Escreva ("Nota de ", nome, " :")
      leia (N)
      Escreval ("---------------")
     T <- T-1
     cont <- cont+1

     Se (N>maior) entao
         maior <- N
         A <- nome
     FimSe
   FimEnquanto



   Escreva ("O melhor aproveitamento foi de ", A, " com a nota ", maior)

Fimalgoritmo