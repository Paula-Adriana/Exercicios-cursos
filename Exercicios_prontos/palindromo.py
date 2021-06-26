palavra = str(input('Digite uma palavra: '))
palavraInvertida = palavra[::-1]

if palavraInvertida == palavra:
    print('A palavra', palavra, ' é um palíndromo.')
else:
    print('A palavra', palavra,  ' não é um palíndromo.')
