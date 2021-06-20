# Tipo da variavel: lista
# A lista acomoda dados do tipo string
frutas = ['laranja', 'banana', 'abacaxi', 'abacate', 'caju', 'melancia']
print(frutas)

# Tipo da variavel: lista
# A lista acomoda dados do tipo float
saldo_alunos = [500.00, 1200.00, 1000.00, 600.00, 50000.00]
print(saldo_alunos)

# Tipo da variavel: lista
# A lista acomoda dados do tipo integer
num_pacientes = [25, 36, 50, 45, 22, 33, 89]
print(num_pacientes)

# Permite duplicados
frutas_duplas = ['laranja', 'banana', 'abacaxi', 'abacate', 'caju', 'melancia', 'laranja', 'banana']
print(frutas_duplas)

#Calcular tamanho da lista
print(len(saldo_alunos))

#Uma lista pode conter diferentes tipos de dados
variados = ['python', 10, 2.569]
print(variados)

#Acessar um item da lista
#escolher a lista e o index correspondente
print(frutas[2])

# Adicionando itens na lista
frutas.append('morango')
print(frutas)

# Unir listas
saldo_alunos.extend(num_pacientes)
print(saldo_alunos)