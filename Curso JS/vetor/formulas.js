let num = [8,1,7,4,2,9]
num.sort()
console.log(num)
let pos = num.indexOf(12)

if (pos == -1){ //-1 retorna quando nao há o valor requerido
    console.log ('O valor não foi encontrado')
} else{
    console.log(`O valor está na posição ${pos}`)
}