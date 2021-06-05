Algoritmo "Aluno_apro_repro"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/3/2020
Var
   // Seção de Declarações das variáveis
   N1, N2, M: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval ("----------------------")
   Escreval ("ESCOLA JAVALI CANSADO")
   Escreval ("----------------------")
   Escreva ("Primeira nota: ")
   Leia (N1)
   Escreva ("Segunda nota: ")
   Leia (N2)
   M <- (N1+N2)/2
   Escreval
   Escreval ("----------------------")
   Escreval ("Média: ", M:3:2)
   Se M >= 7 entao
      Escreval ("ALUNO APROVADO")
   SENAO
      Se (M >=5) e (M<7) entao
         Escreval ("Aluno em RECUPERAÇÃO")
      senao
         Escreval ("ALUNO REPROVADO")
      FimSe
    FimSe
      Escreva ("----------------------")
Fimalgoritmo