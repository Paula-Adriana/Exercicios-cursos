let valores = [8,1,7,4,2,9]
//como mostar na tela
console.log(valores) //modo normal vetor
/*
console.log(valores[0])
console.log(valores[1])
console.log(valores[2])
console.log(valores[3])
console.log(valores[4])
console.log(valores[5])
*/ //mostrando cada posicao, muito codigo!

/*
for(let pos=0; pos < valores.length; pos++){
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
}
*/ // "for" estrutura normal 

//"for" estrutra de repeticao para variavel composta

for(let pos in valores) {
    console.log (`A posição ${pos} tem o valor ${valores[pos]}`)

}