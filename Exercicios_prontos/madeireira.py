'''Você trabalha em uma madeireira e lida com os pedidos dos clientes. Você tem três pedidos para realizar no dia e o seu 
gerente pediu para você selecionar o maior_3 pedido para fazer a entrega. Cada pedido é uma lista com os códigos dos produtos
que devem ser entregues. Por ser essa uma situação corriqueira você deve criar uma função que automatiza o processo.'''


ped_1 = [45, 859, 000, 589, 45, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_2 = [451, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_3 = [589, 78, 52, 12, 69, 78, 859, 000, 589, 45, 78, 69, 52, 85, 69, 78, 523, 696]
ped_4 = [45, 859, 000, 589, 45, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_5 = [451, 78, 69, 85, 69, 78, 523, 696, 1]
ped_6 = [589, 78, 45, 78, 69, 52, 85, 69, 78, 523, 696]
ped_7 = [45, 859, 000, 589, 45, 78, 69, 696, 1]
ped_8 = [451, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_9 = [589, 45, 78, 69, 52, 85, 69, 78, 523, 696]

def maior_pedido(a, b, c):
    maior_3 = 0
    if len(a) > len(b):
        if len(a) > len(c):
            maior_3 = a
        else:
            maior_3 = c
    else:
        if len(b) > len(c):
            maior_3 = b
        else:
            maior_3 = c
    return maior_3

print(maior_pedido(ped_1, ped_2, ped_3))
print(maior_pedido(ped_4, ped_5, ped_8))