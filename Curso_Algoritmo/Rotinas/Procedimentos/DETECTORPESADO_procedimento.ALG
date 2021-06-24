Algoritmo "DetectorPesado"

Var
I: inteiro
N, Pesado: caractere
P, mai: Real
Procedimento topo ()
Inicio
   LimpaTela
   Escreval ("=================================")
   Escreval ("       DETECTOR DE PESADO        ")
   Escreval ("Maior peso até agora: ", Mai," kg")
   Escreval ("=================================")
Fimprocedimento

Inicio
Topo ()
Para I <- 1 ate 5 faca
Escreva ("Digite o nome: ")
Leia (N)
Escreva ("Digite o peso de ", N, ": ")
leia (P)
Se (P>Mai) entao
   Mai <- P
   Pesado <- N
FimSe
Topo ()
FimPara
Topo ()
Escreval ("A pessoa mais pesada foi ", pesado, " com: ", Mai, " quilos.")

Fimalgoritmo