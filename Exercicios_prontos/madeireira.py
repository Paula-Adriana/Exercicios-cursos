'''Você trabalha em uma madeireira e lida com os pedidos dos clientes. Você tem três pedidos para realizar no dia e o seu 
gerente pediu para você selecionar o maior_3 pedido para fazer a entrega. Cada pedido é uma lista com os códigos dos produtos
que devem ser entregues. Por ser essa uma situação corriqueira você deve criar uma função que automatiza o processo.'''


ped_1 = [45, 859, 000, 589, 45, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_2 = [451, 78, 69, 52, 85, 69, 78, 523, 696, 1]
ped_3 = [589, 78, 52, 12, 69, 78, 859, 000, 589, 45, 78, 69, 52, 85, 69, 78, 523, 696]

def maior_pedido(ped_1, ped_2, ped_3):
    maior_3 = 0
    if len(ped_1) > len(ped_2):
        if len(ped_1) > len(ped_3):
            maior_3 = ped_1
        else:
            maior_3 = ped_3
    else:
        if len(ped_2) > len(ped_3):
            maior_3 = ped_2
        else:
            maior_3 = ped_3
    return maior_3

print(maior_pedido(ped_1, ped_2, ped_3))