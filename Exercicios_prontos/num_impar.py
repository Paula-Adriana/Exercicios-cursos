'''Ler uma lista e a partir desta, criar uma nova somente com os números ímpares.'''

lista_geral = [3, 250, 1, 12, 85, 89, 74, 10, 89, 74, 65, 60, 31, 30, 5, 40]
lista_impar = []

for i in lista_geral:
    if i % 2 != 0:
        lista_impar.append(i)
        

print(lista_impar)

#---------------------------------------------------------------------------------------
# Outra forma
#---------------------------------------------------------------------------------------

lista_geral = [3, 250, 1, 12, 85, 89, 74, 10, 89, 74, 65, 60, 31, 30, 5, 40]
impar = [i for i in lista_geral if i % 2 != 0]
print(impar)