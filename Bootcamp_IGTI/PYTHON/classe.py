#Criando uma função para o gato dizer 'oi'

def oi(obj):
    print('Miau, eu sou o gato ' + obj.name + '!')

class animal:
    pass # Toda vez que existe os dois pontos(:) é como se uma porta fosse aberta e o python aguarda os atributos
         # como não será colocado nada, ao digitar pass o python 'libera' a classe mesmo sem comando digitado.

x = animal()
x.name = 'Bilbo'
oi(x)
# Miau, eu sou o gato Bilbo!
#-------------------------------------------------------------------------------------------------------------------
def miau(obj):
    print('Miau!')

def ronronar(obj):
    print('prprprpr!')

class animal:
    miar = miau #atributo
    ronronar = ronronar #atributo

x = animal()
x.name = 'Bilbo'
animal.ronronar(x)
animal.miar(x)

# prprprpr!
# Miau!
#-------------------------------------------------------------------------------------------------------------------