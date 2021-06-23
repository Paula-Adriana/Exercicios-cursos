num = 1
while num < 10:
    print(num)
    num += 1

# Com break
num = 1
while num < 10:
    print(num)
    if num == 6:
     break # irá parar quando encontrar o numero 6. 
    num += 1

# Com continue
num = 0
while num < 20:
    num += 1    
    if num == 12:
     continue #(na contagem, pulará o 12) 10,11,13,14...
    print(num) 
