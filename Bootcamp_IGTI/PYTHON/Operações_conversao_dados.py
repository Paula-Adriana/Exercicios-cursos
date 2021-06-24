from typing import overload


num_end = 500
num_end_2 = '200'

#Convertendo numero para string
num_end_s = str(num_end)
print(num_end_s)
print(type(num_end_s)) #<class 'str'>

#Convertendo string para numero  
num_end_i = int(num_end_2)
print(num_end_i)
print(type(num_end_i)) #<class 'int'>

#Convertendo numero inteiro para float
num_end_f = float(num_end)
print(num_end_f)
print(type(num_end_f)) #<class 'float'>


#-------------------------------------------#
#Valor booleano
p = 'pão'
b = 'baú'
r = p > b
print(r) #True
print(p.encode())#b'p\xc3\xa3o'
print(b.encode())#b'ba\xc3\xba'
#Essa é a comparação que o python está realizando. Conforme tabela ASCII.
#Tabela ASCII - Codigo padrao americano para o intercambio de informaçoes.
#Codigo binario que codifica um conjunto de 128 sinais: 95 sinais graficos. 