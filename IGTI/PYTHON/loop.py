trabalho = input('Você deve trabalhar hoje? ')
dia = input('O dia está bonito? ')
preguica = input('Você está com preguiça? ')

# Loop da vida
if trabalho == 'sim':
    print('É uma pena!')
elif trabalho == 'não':
    print('Aproveite o dia!')

if dia == 'sim' and trabalho == 'não':
    print('Aproveite para caminhar!')
elif dia == 'não' and trabalho == 'não':
    print('Aproveite e assista um filme!')

if preguica == 'sim' and trabalho == 'não':
    print('Aproveita e dorme mais!')
elif preguica == 'não' and trabalho == 'não':
    print('Que tal estudar Python?')