# Usar quando a variavel nao será alterada, permanecer de tal forma, ordenada e indexada usar a tupla
# Permite duplicados

frutas = ('laranja', 'banana', 'abacaxi', 'abacate', 'caju', 'melancia')
saldo_alunos = (500.00, 1200.00, 1000.00, 600.00, 50000.00)
num_pacientes = (25, 36, 50, 45, 22, 33, 89)

# Valores indexados
print(frutas[1])
print(frutas[1:4])
#('banana', 'abacaxi', 'abacate') - somente imprimirá os indices 1, 2 e 3.

# Unir tuples
tupla_junto = frutas + num_pacientes
print(tupla_junto)

# Para saber o tipo de variável
print(type(tupla_junto))

# Contar valores repetidos na tupla
num_pacientes_rep = (25, 36, 50, 45, 22, 33, 89, 25, 36, 50, 45, 22, 33, 89, 25, 36, 50, 45, 22, 33, 89,
25, 36, 50, 45, 22, 33, 89,25, 36, 50, 45, 22, 33, 89)
# Quantas vezes o numero 45 repetiu?
print(num_pacientes_rep.count(45))


