# if-----------------------
a = 50
b = 100
c = 50

if a == c:
    print('A igual C') 

if a != b:
    print('A diferente de  C')

# elif (else+if) ---------
idade = int(input('Digite a sua idade: ')) #interacao com o usuario, traz como string transformar pra int
if idade >= 18:
    print('Você já pode dirigir!')
elif idade < 18:
    print('Você ainda não pode dirigir!')

# Outro exemplo
exercicio = int(input('Quantos minutos você se exercita por dia: '))
if exercicio < 30:
    print('Você deveria se exercitar mais.')
elif exercicio >= 31 and exercicio <= 60:
    print('Você está no caminho certo.')
elif exercicio >= 61 and exercicio <= 120:
    print('Você é um(a) atleta.')
else:
    print('Cansei só de saber!')