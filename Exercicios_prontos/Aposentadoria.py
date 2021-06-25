'''Problema: Criar um programa que diga a pessoa em qual ano ela irá se aposentar. Perguntar: nome, idade e ano de nascimento
e criar uma mensagem com o resultado. Considere 65 para aposentadoria.'''

print('Cálculo de aposentadoria')
print('--------------------------')
nome = input('Qual é o seu nome? ')
idade = int(input('Qual a sua idade? '))
ano_nasc = int(input('Em qual ano você nasceu? '))
ano_aposent = 2021 - ano_nasc
ano_restante = 65 - idade

if ano_aposent == 65 or ano_aposent > 65:
    print('Você já possui idade para se aposentar!')
else:
    print('Ainda faltam', ano_restante, 'anos para você se aposentar.')
