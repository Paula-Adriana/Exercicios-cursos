Algoritmo "EscolhendoPessoas"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/3/2020
Var
   // Seção de Declarações das variáveis
   sexo, Resp: caractere
   idade, loiro, castanho, cabelo: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Repita
      Escreval ("=====================")
      Escreval (" SELETOR DE PESSOAS  ")
      Escreval ("=====================")
      Escreva ("Qual o sexo? [M/F] ")
      Leia (sexo)
      Escreva ("Qual a idade? ")
      Leia (idade)
      Escreval ("Qual a cor do cabelo? ")
      Escreval ("---------------------")
      Escreval ("[1] Preto")
      Escreval ("[2] Castanho")
      Escreval ("[3] loiro")
      Escreval ("[4] Ruivo")
      leia (Cabelo)
           Se (cabelo=3) e (idade >=25) e (idade <=30) e (sexo="F") entao
              loiro <- loiro+1
           senao
                se (cabelo=2) e (idade > 18) e (sexo="M") entao
                   castanho <- castanho+1
                FimSe
           FimSe


      Escreval ("Deseja continuar? [S/N] ")
      leia (Resp)
      limpatela
   Ate (Resp = "N")
   Escreval ("=================================")
   Escreval ("          RESULTADO              ")
   Escreval ("=================================")
   Escreval ("Total de homens com mais de 18 anos e cabelos castanhos é: ", castanho)
   Escreval ("Total de mulheres entre 25 e 30 anos e cabelos loiros é: ", loiro)


Fimalgoritmo