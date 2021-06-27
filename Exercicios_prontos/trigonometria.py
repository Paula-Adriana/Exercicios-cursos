'''Criar um scrip que faça cálculos trigonométricos para o usuário a partir de um valor em graus para um ângulo. Com o valor em graus inserido
pelo usuário converta-o em radianos e imprima os valores de seno, cosseno e tangente.'''

import math
#Com casa decimal (se for inteiro usar int)
grau = float(input('Digite um valor em graus: '))

#Cosseno
print(math.acos(grau))

#Seno
print(math.asin(grau))

#Tangente
print(math.atan(grau))
