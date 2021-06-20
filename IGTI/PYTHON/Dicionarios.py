# Armazena duas variaveis geralmente relacionadas
# Duplicados não permitidos

cod_uf = { 21: 'Maranhão', 22: 'Piauí', 23: 'Ceará', 24: "Rio Grande do Norte", 25: 'Paraíba',
    26: 'Pernambuco', 27: 'Alagoas', 28:'Sergipe', 29: 'Bahia'}
print(type(cod_uf))
print(cod_uf)

# Valor ordenado após o Python 3.7
print(cod_uf.values())
#dict_values(['Maranhão', 'Piauí', 'Ceará', 'Rio Grande do Norte', 'Paraíba', 'Pernambuco', 'Alagoas', 'Sergipe', 'Bahia'])

# Acessando os valores
print(cod_uf.get(29)) #Bahia

#Imprimindo códigos chave
print(cod_uf.keys()) #dict_keys([21, 22, 23, 24, 25, 26, 27, 28, 29])

#Adicionando novos valores
cod_uf[30] = 'Estado do Vira-lata Caramelo'
print(cod_uf)