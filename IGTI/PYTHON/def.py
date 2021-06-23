def soma(x,y):
    print(x+y)
soma(10,5)

# Calculando o IMC
def imc(peso, altura):
    imc = peso/(altura**2)
    if imc < 18.5:
        print('Seu IMC indica que você está abaixo do peso')
    elif imc > 18.5 and imc <=24.9:
        print('Seu IMC está Normal')
    elif imc < 25 and imc <= 29.9:
        print('Seu IMC indica que você está com Sobrepeso')
    elif imc >= 30 and imc <= 39.9:
        print('Seu IMC indica que você está com Obesidade I')
    else:
        print('Seu IMC indica que você está Obesidade II')
    return 

imc(20,1.92)

