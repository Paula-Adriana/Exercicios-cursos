import random
# Função para embaralhar os caracteres de uma string
def embaralha(string): #password
    tempList = list(string) #guarda na lista as letras pseudoaleatorias
    random.shuffle(tempList) #embaralha a lista
    return ''.join(tempList) #concateana a lista embaralhada

# Gerar letras pseudoaleatórias com base na tabela ASCII
letra_1 = chr(random.randint(65,90)) #Maiúsculas
letra_2 = chr(random.randint(33,42)) #Caractere especial
letra_3 = chr(random.randint(97,122)) #Minúsculas
letra_4 = chr(random.randint(33,42))
letra_5 = chr(random.randint(48,57))
letra_6 = chr(random.randint(65,90))
letra_7 = chr(random.randint(97,122))

password = letra_1 + letra_2 + letra_3 + letra_4 + letra_5 + letra_6 + letra_7
password = embaralha(password)

print(password)