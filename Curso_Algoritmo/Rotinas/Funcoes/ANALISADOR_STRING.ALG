Algoritmo "analisador_string"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 6/4/2020
Var
// Seção de Declarações das variáveis 
  N: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   Escreva ("Digite seu nome: ")
   Leia (N)
   Escreval ("Total de letras do seu nome: ", Compr (N))
   Escreval ("Seu nome em maiusculas é: ", maiusc (N))
   Escreval ("Seu nome em minusculas é: ", minusc (N))
   Escreval ("A primeira letra do seu nome é: ", Copia (maiusc (N), 1, 1))
   Escreval ("A ultima letra do seu nome é: ", Copia (maiusc (N), Compr (N), 1))
   Escreval ("Seu nome tem a letra A na posicao: ", pos ("A", maiusc (N)))
   Escreval ("O codigo da letra A é: ", Asc ("A"))
   Escreval ("A letra de codigo 65 é: ", Carac (65))
Fimalgoritmo