//Encontrar os multiplos de 3 ou 5 abaixo de 1000 e Somar os multiplos


var multiplos = [] //array para salvar e poder somar os multiplos

for (i = 1; i < 1000; i++) {
    if ((i%3 === 0) || (i%5 === 0)) {
    console.log (i)
    multiplos.push(i) //adiciona os numeros encontrados no vetor
    }
}
//para somar os multiplos
var soma = 0
for (var i = 0; i < multiplos.length; i++) {
    soma = soma + multiplos[i] //ou soma += multiplos[i]
}
console.log (`O somatório dos múltiplos de 3 ou 5 é ${soma}`)