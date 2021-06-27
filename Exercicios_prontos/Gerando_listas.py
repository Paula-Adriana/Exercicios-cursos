'''A partir de uma lista você deve criar uma nova lista com o primeiro e o ultimo elemento. Para isso você deve criar
uma função que faça essa criação automaticamente. Crie uma função que sirva para qualquer tamanho de lista.'''

numeros = [6, 15, 45, 58, 60, 47, 58, 78, 98, 56, 23, 34, 0, 77, 99, 87, 66, 100, 985, 47]
def nova_lista(lista):
    return [lista[0], lista[len(lista)-1]]
    #primeiro = [0]
    #ultimo = comprimento da lista (len(lista) menos 1. 

print(nova_lista(numeros))