import random
min = 1
max = 6

jogar_novamente = 'sim'
while jogar_novamente == 'sim' or jogar_novamente == 's':
    print('Jogando os dados...')
    print('Os valores são: ')
    print (random.randint(min, max))
    print (random.randint(min, max))

    jogar_novamente = input('Deseja jogar mais uma vez?')

