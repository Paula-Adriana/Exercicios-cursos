Algoritmo "C"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/4/2020
Var
// Seção de Declarações das variáveis 
  nome: caractere
  soC: vetor [1..10] de caractere
  c, tot: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Para c<- 1 ate 10 faca
        Escreva ("Digite seu nome: ")
        leia (nome)
        Se (copia (maiusc (nome),1,1) = "c") entao
        tot <- tot +1
        soC[tot] <- nome
        FimSe
   FimPara
   LimpaTela
   Escreval ("LISTAGEM FINAL")
   Para c <- 1 ate tot faca
   Escreval (soC[c])
   FimPara

Fimalgoritmo