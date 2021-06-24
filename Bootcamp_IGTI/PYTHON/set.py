# Não ordenado / Não pode ser modificado / Não aceitam duplos
# Útil em backend (ex: armazenar CPF)

cidade = {'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal'}
print(type(cidade))
print(cidade) 
#desordenado!{'Belo Horizonte', 'Fortaleza', 'Manaus', 'Natal'} 

# Não permite duplos
cidade_dupla = {'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal', 'Manaus', 'Fortaleza', 'Natal',
'Manaus', 'Fortaleza', 'Natal','Manaus', 'Fortaleza', 'Natal','Manaus', 'Fortaleza', 'Natal'}
print(cidade_dupla)
#{'Fortaleza', 'Belo Horizonte', 'Natal', 'Manaus'} - Não armazena os duplos!!

# Checando valores em set
# Verificar se Manaus está na variavel cidade
# Retornará um valor booleano
print('Manaus' in cidade) #True
print('Recife' in cidade) #False

#Adicionando item ao set
cidade.add('João Pessoa')
print(cidade) #{'Fortaleza', 'Natal', 'João Pessoa', 'Belo Horizonte', 'Manaus'}

#Unir set
cidade_2 = {'Recife', 'Blumenau'}
cidade.update(cidade_2)
print(cidade)
