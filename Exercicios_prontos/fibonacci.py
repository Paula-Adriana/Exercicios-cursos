'''Criar um programa que mostre a sequencia de fibonacci com base na quantidade de números que o usuário deseja saber'''

def seq():
    num = int(input('Quantos números da sequência de Fibonacci deseja gerar? '))
    i = 1
    if num == 0:
        fib = []
    elif num == 1:
        fib = [1]
    elif num == 2:
        fib = [1, 1]
    elif num > 2:
        fib = [1, 1]
        while i < (num - 1):
            fib.append(fib[i] + fib[i - 1])
            i += 1
    return fib

print(seq())


#---------------------------------------------------------------------------------------
# Outra forma
#---------------------------------------------------------------------------------------


def seq2():
    num = int(input('Quantos números da sequência de Fibonacci deseja gerar? '))
    i = 0
    a = 0
    b = 1
    fib = [a, b]

    while i < (num - 1):
        c = a + b
        fib.append(c)
        i += 1
        a = b
        b = c
    return fib    
print(seq2())