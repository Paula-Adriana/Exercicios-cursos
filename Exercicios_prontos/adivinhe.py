import random

n = random.randint(1,99)
adivinhe = int(input('Tente adivinhar um número entre 1 e 99: '))

while n != adivinhe:
    print()
    if adivinhe < n:
        print ('O número é maior que este')
        adivinhe = int(input('Tente outra vez: '))
    elif adivinhe > n:
        print ('O número é menor que este')
        adivinhe = int(input('Tente outra vez: '))

if n == adivinhe:
    print('Parabéns! Você acertou!')
