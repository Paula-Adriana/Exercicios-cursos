var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
var i = 0
while (i < numeros.length) {
    var num = numeros[i]
    i++
    if (num % 2 === 0) {
        console.log (num + " é Par!") 
    } else {
            console.log (num + " é Impar!") 
    }
}
