#Jogo pedra papel tesoura
from random import randint

# Cria uma lista com as opções
t = ['Pedra', 'Papel', 'Tesoura']

# Coloca o computador para jogar dentro das opções. Listas são indexadas por isso 0,2 (pedra(0), papel(1), tesoura(2))
computador = t[randint(0,2)]
jogador = False

while jogador == False:
    jogador = input('Pedra, Papel ou Tesoura? ')
    if jogador == computador:
        print('Empate!')
    elif jogador == 'Pedra':
        if computador == 'Papel':
            print('Você perdeu!', computador, 'embrulha', jogador)
        else:
            print('Você venceu!', jogador, 'esmaga', computador)
    elif jogador == 'Papel':
        if computador == 'Tesoura':
            print('Você perdeu!', computador, 'corta', jogador)
        else:
            print('Você venceu!', jogador, 'embrulha', computador)
    elif jogador == 'Tesoura':
        if computador == 'Pedra':
            print('Você perdeu!', computador, 'esmaga', jogador)
        else:
            print('Você venceu!', jogador, 'corta', computador)
    else:
        print('Essa não é uma jogada válida, verifique a ortografia.')

# Para continuar o jogo

    jogador = False
    computador = t[randint(0,2)]