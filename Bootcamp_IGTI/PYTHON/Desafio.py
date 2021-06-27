#Função 01
def saudacao(nome):
 print('Olá', nome, 'tudo bem?')
saudacao('Roberto')

#Função 02
def imc(peso, altura):
 print(peso / altura ** 2)
imc(80, 1.65)

#Função 03
def soma(x, y):
    print(x + y)

#Laço 01
num = 0
while num < 20:
 print(num)
 num += 1

#Laço 02
for i in range(0, 10, 2):
   print(i)

#Laço 03
numeros = [1,2,3,4,5,6,7,8,9,10]
for x in numeros:
 print(x)
 if x == 3:
    break

#Laço 04
num = 0
while num < 10:
 num += 1
 if num == 6:
    continue
 print(num)

